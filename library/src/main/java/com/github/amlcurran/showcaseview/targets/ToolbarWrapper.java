package com.github.amlcurran.showcaseview.targets;

import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 *
 * @author dave
 */
public class ToolbarWrapper implements BarViewWrapper {

    private final Toolbar mToolbar;

    public ToolbarWrapper(Toolbar toolbar) {
        mToolbar = toolbar;
    }

    @Override
    public View getActionItem(int actionItemId) {
        return mToolbar.findViewById(actionItemId);
    }

    @Override
    public View getMediaRouterButtonView() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public View getOverflowView() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public View getSpinnerView() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public View getTitleView() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
