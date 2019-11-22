package sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;


class ZoomingPane extends Pane {
        Node content;
        private DoubleProperty zoomFactor = new SimpleDoubleProperty(1);

        ZoomingPane(Node content) {
            this.content = content;
            getChildren().add(content);
            Scale scale = new Scale(2, 2);
            content.getTransforms().add(scale);

            zoomFactor.addListener(new ChangeListener<Number>() {
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    scale.setX(newValue.doubleValue());
                    scale.setY(newValue.doubleValue());
                    requestLayout();
                }
            });
        }

    }
