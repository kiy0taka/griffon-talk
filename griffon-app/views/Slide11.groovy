import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D

transition = new BlendTransition2D()

def script = '''

class SampleModel {
    String username
    String password
}'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("Model", cssClass: "title", constraints: "wrap")
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}