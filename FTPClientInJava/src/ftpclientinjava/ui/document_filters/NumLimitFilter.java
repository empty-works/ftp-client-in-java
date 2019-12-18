/*
 */
package ftpclientinjava.ui.document_filters;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author MP
 */
public class NumLimitFilter extends DocumentFilter {
    
    final static private int LIMIT = 4;
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, 
            AttributeSet attrs) throws BadLocationException {
        
        int currentLength = fb.getDocument().getLength();
        int overLimit = (currentLength + text.length()) - LIMIT - length;
        if(overLimit > 0) {
            
            text = text.substring(0, text.length() - overLimit);
        }
        if(text.length() > 0) {
            
            super.replace(fb, offset, length, text, attrs);
        }
    }
}
