package defpackage;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fp0  reason: default package */
/* loaded from: classes.dex */
public abstract class fp0 {
    public static final long a = ViewConfiguration.getTapTimeout();

    public static final boolean a(g0 g0Var) {
        ViewParent parent = se.S(g0Var).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
