/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.amlcurran.showcaseview.targets;

import android.view.View;

/**
 *
 * @author dave
 */
public interface BarViewWrapper {

    View getActionItem(int actionItemId);

    /**
     * Return the view which represents the MediaRouterButton action item on the ActionBar, or null
     * if there isn't one
     */
    View getMediaRouterButtonView();

    /**
     * Return the view which represents the overflow action item on the ActionBar, or null if there isn't one
     */
    View getOverflowView();

    /**
     * Return the view which represents the spinner on the ActionBar, or null if there isn't one
     */
    View getSpinnerView();

    /**
     * Return the view which represents the title on the ActionBar, or null if there isn't one
     */
    View getTitleView();
    
}
