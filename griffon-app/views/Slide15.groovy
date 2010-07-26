import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D
import groovy.beans.Bindable

transition = new BlendTransition2D()

def script = '''// Model
import groovy.beans.Bindable

// View
class SampleModel {
    textField(text:bind(target:model, ’text’))
    label(text:bind(source:model, 'text'))
}
'''

class Slide15Model {
    @Bindable String text
}

def model = new Slide15Model()

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("ViewからModelへ", cssClass: "title", constraints: "center, wrap")
  textField(text:bind(target:model, 'text'), columns:20, cssClass: "desc", constraints: "wrap")
  label(text:bind(source:model, 'text'), cssClass: "desc", constraints: "wrap")
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}