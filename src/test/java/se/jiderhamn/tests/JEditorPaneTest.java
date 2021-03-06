package se.jiderhamn.tests;

import javax.swing.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.JUnitClassloaderRunner;
    
/**
 * Confirm leak caused by JEditorPane
 * @author Mattias Jiderhamn
 */
@RunWith(JUnitClassloaderRunner.class)
public class JEditorPaneTest {

  @Test
  public void triggerJEditorPaneLeak() throws Exception {
    new JEditorPane("text/plain", "dummy");
  }
  
}