import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D
import groovy.beans.Bindable

transition = new BlendTransition2D()

def script = '''import groovy.beans.Bindable

// Model
class SampleModel {
    @Bindable Date now
}

// View
label(text:bind(source:model, 'now',
    converter:{it.format('31歳とHH時間mm分ss.SSS秒')}))

// Controller
doOutside {
    while (true) {
        edt {
            model.now = new Date()
        }
        sleep 128
    }
}'''

class Slide14Model {
    @Bindable Date now
}

def model = new Slide14Model()

doOutside {
    while (true) {
        edt {
            model.now = new Date()
        }
        sleep 128
    }
}

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("ModelからViewへ", cssClass: "title", constraints: "center, wrap")
  label(text:bind(source:model, 'now', converter:{it.format('31歳とHH時間mm分ss.SSS秒')}), cssClass: "desc", constraints: "wrap")
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}