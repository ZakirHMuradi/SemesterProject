package com.example.caloriescalculator;


import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Triangle3D extends Application {

    private PerspectiveCamera camera;
    private final double sceneWidth = 600;
    private final double sceneHeight = 600;
    private double scenex, sceney = 0;
    private double fixedXAngle, fixedYAngle = 0;
    private final DoubleProperty angleX = new SimpleDoubleProperty(0);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);

    @Override
    public void start(Stage primaryStage) {

        Group sceneRoot = new Group();
        Scene scene = new Scene(sceneRoot, sceneWidth, sceneHeight);
        scene.setFill(Color.BLACK);
        camera = new PerspectiveCamera(true);
        camera.setNearClip(0.1);
        camera.setFarClip(10000.0);
        camera.setTranslateZ(-1000);
        scene.setCamera(camera);

        Group pyramid1 = buildPyramid(100,200,Color.BURLYWOOD,true,false);
        pyramid1.setTranslateX(-100);
        Group pyramid2 = buildPyramid(100,200,Color.CHOCOLATE,true,true);
        pyramid2.setTranslateX(-100);
        pyramid2.setTranslateY(-100);
        pyramid2.setRotationAxis(Rotate.Z_AXIS);
        pyramid2.setRotate(180);

        Group pyramid3 = buildPyramid(100,200,Color.DARKSLATEBLUE,true,true);
        pyramid3.setTranslateX(100);
        Group pyramid4 = buildPyramid(100,200,Color.DEEPSKYBLUE,true,false);
        pyramid4.setTranslateX(100);
        pyramid4.setTranslateY(-100);
        pyramid4.setRotationAxis(Rotate.Z_AXIS);
        pyramid4.setRotate(180);
        Group pyramidGroup = new Group(pyramid1,pyramid2,pyramid3,pyramid4);
        sceneRoot.getChildren().addAll(pyramidGroup);

        Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
        pyramidGroup.getTransforms().addAll(xRotate,yRotate);

        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        scene.setOnMousePressed(event -> {
            scenex = event.getSceneX();
            sceney = event.getSceneY();
            fixedXAngle = angleX.get();
            fixedYAngle = angleY.get();
        });

        scene.setOnMouseDragged(event -> {
            angleX.set(fixedXAngle - (scenex -  event.getSceneY()));
            angleY.set(fixedYAngle + sceney -  event.getSceneX());
        });

        PointLight light = new PointLight(Color.WHITE);
        sceneRoot.getChildren().add(light);
        light.setTranslateZ(-sceneWidth/2);
        light.setTranslateY(-sceneHeight/2);

        primaryStage.setTitle("3D_Triangle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    private Group buildPyramid(float height, float hypotenuse,
                               Color color,
                               boolean ambient,
                               boolean fill) {
        final TriangleMesh mesh = new TriangleMesh();

        mesh.getPoints().addAll(
                0,0,0,
                0,height,-hypotenuse/2,
                -hypotenuse/2,height,0,
                hypotenuse/2,height,0,
                0,height,hypotenuse/2
        );
        mesh.getTexCoords().addAll(0,0);
        mesh.getFaces().addAll(
                0,0,2,0,1,0,
                0,0,1,0,3,0,
                0,0,3,0,4,0,
                0,0,4,0,2,0,
                4,0,1,0,2,0,
                4,0,3,0,1,0
        );

        MeshView meshView = new MeshView(mesh);

        meshView.setDrawMode(DrawMode.LINE);
        meshView.setCullFace(CullFace.BACK);

        Group pyramidGroup = new Group();
        pyramidGroup.getChildren().add(meshView);

        if(null != color) {
            PhongMaterial material = new PhongMaterial(color);
            meshView.setMaterial(material);
        }
        if(ambient) {
            AmbientLight light = new AmbientLight(Color.WHITE);
            light.getScope().add(meshView);
            pyramidGroup.getChildren().add(light);
        }
        if(fill) {
            meshView.setDrawMode(DrawMode.FILL);
        }


        return pyramidGroup;
    }
    public static void main(String[] args) {
        launch(args);
    }

}
