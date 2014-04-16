

package org.uberfire.client.workbench.panels.impl;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import org.uberfire.client.workbench.PanelManager;
import org.uberfire.client.workbench.events.MaximizePlaceEvent;
import org.uberfire.client.workbench.events.MinimizePlaceEvent;

@Dependent
public class TemplatePerspectiveWorkbenchPanelPresenter extends AbstractTemplateWorkbenchPanelPresenter<TemplatePerspectiveWorkbenchPanelView> {

    @Inject
    public TemplatePerspectiveWorkbenchPanelPresenter( @Named("TemplatePerspectiveWorkbenchPanelView") final TemplatePerspectiveWorkbenchPanelView view,
                                                       final PanelManager panelManager,
                                                       final Event<MaximizePlaceEvent> maximizePanelEvent,
                                                       final Event<MinimizePlaceEvent> minimizePanelEvent ) {
        this.view = view;
        this.panelManager = panelManager;
        this.maximizePanelEvent = maximizePanelEvent;
        this.minimizePanelEvent = minimizePanelEvent;
    }

}
