import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D
import groovy.beans.Bindable

transition = new BlendTransition2D()

def script = '''comboBox(id:'cb', items: ['enable', 'disable'])
textField(text:'Hello Griffon', enabled:bind(
    source:cb,
    sourceEvent:'itemStateChanged',
    sourceValue:{ cb.selectedItem == 'enable'}
  )
)'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("ViewからViewへ", cssClass: "title", constraints: "center, wrap")
  panel(constraints: "wrap") {
      def cb = comboBox(items: ['enable', 'disable'], cssClass: "desc")
      textField(text:'Hello Griffon', enabled:bind(
          source:cb,
          sourceEvent:'itemStateChanged',
          sourceValue:{ cb.selectedItem == 'enable'}
        ), cssClass: "desc")
  }
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}