import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D
import groovy.beans.Bindable

transition = new BlendTransition2D()

def script = '''class SampleController {
    def model
    def view

    def mvcGroupInit(Map args) {
        ...
    }

    def mvcGroupDestroy() {
        ...
    }

    def fooAction = { evt -> ... }
    def barAction = { evt -> ... }
}

// View
button(actionPerformed:controller.fooAction)'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("Controller", cssClass: "title", constraints: "center, wrap")
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}