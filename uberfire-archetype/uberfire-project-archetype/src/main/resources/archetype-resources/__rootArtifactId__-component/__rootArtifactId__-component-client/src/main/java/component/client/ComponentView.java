#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.component.client;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

import com.github.gwtbootstrap.client.ui.Label;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;

@Dependent
public class ComponentView extends Composite implements ComponentPresenter.View {

    private FlowPanel container = new FlowPanel();

    private Label label = new Label( "Empty" );

    @PostConstruct
    public void setup() {
        initWidget( container );
        container.add( label );
    }

    @Override
    public void setValue( String value ) {
        label.setText( value );
    }
}