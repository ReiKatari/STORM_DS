package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xg2  reason: default package */
/* loaded from: classes.dex */
public final class xg2 extends Transition.EpicenterCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ xg2(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.a;
        Rect rect = this.b;
        switch (i) {
            case 0:
                return rect;
            default:
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
