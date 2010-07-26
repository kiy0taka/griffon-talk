import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants

def script = '''import groovy.beans.Bindable

class SampleModel {
    @Bindable String username
    @Bindable String password
}'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("Model", cssClass: "title", constraints: "wrap")
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}