package com.alex.home.controller;

import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Oleksandr Ivanov
 */
@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {

    @Spy
    private Text mockText = new Text();

    @Spy
    private PasswordField mockPassword = new PasswordField();

    @InjectMocks
    private SampleController sampleController;

    @Test
    public void testActionHandler() {
        sampleController.handleSubmitButtonAction(null);
        Mockito.verify(mockText).setText(Mockito.anyString());
        Mockito.verify(mockPassword).getText();
    }
}
