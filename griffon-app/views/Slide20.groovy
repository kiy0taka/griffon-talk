import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D
import groovy.beans.Bindable

transition = new BlendTransition2D()

def script = '''textArea(id:'t', columns:10, rows:3)
button('Start', actionPerformed: {
  sleep 1000
  t.append('1\\n')
  sleep 1000
  t.append('2\\n')
  sleep 1000
  t.append('3')
})'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("?", cssClass: "title", constraints: "center, wrap")
  panel(cssClass: "desc", constraints: "wrap") {
      def t = textArea(id:'t', columns:10, rows:3, editable: false, cssClass: "desc", constraints: "wrap")
      button('Start', actionPerformed: {
        sleep 1000
        t.append('1\n')
        sleep 1000
        t.append('2\n')
        sleep 1000
        t.append('3')
      }, cssClass: "desc", constraints: "wrap")
  }
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}