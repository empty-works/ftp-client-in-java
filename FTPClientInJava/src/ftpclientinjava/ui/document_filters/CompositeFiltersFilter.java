/*
 */
package ftpclientinjava.ui.document_filters;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

/**
 *
 * @author MP
 */
public class CompositeFiltersFilter {
    
    private DocumentFilter[] filters;
    
    public CompositeFiltersFilter(DocumentFilter... filters) {
        
        this.filters = filters;
    }
    
    public void insertString(FilterBypass fb, int offs, String str, AttributeSet a) 
            throws BadLocationException {
        
        for(DocumentFilter filter : filters) {
            
            filter.insertString(fb, offs, str, a);
        }
    }
    
    public void replace(FilterBypass fb, int offs, int length, String str, AttributeSet a) 
            throws BadLocationException {
        
        for(DocumentFilter filter : filters) {
            
            filter.replace(fb, offs, length, str, a);
        }
    }
}
