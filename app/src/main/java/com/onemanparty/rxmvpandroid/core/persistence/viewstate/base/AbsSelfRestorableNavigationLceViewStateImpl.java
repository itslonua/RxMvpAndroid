package com.onemanparty.rxmvpandroid.core.persistence.viewstate.base;

import com.onemanparty.rxmvpandroid.core.view.LceView;
import com.onemanparty.rxmvpandroid.core.view.view_model.EmptyViewModel;

/**
 * Base ViewState implementation for {@link LceView} with view-based navigation and ability to restore itself
 * ~~ means, save / restore logic is internal to the object implementing this interface
 */
public abstract class AbsSelfRestorableNavigationLceViewStateImpl<D extends EmptyViewModel, E extends Enum<E>, V extends LceView<D, E>, T>
                        extends AbsNavigationLceViewStateImpl<D, E, V, T>
                        implements SelfRestorableViewState {

}
