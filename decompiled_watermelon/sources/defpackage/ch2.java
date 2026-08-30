package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ch2  reason: default package */
/* loaded from: classes.dex */
public final class ch2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ ArrayList R;
    public final /* synthetic */ ArrayList X;

    public ch2(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.A = i;
        this.B = arrayList;
        this.L = arrayList2;
        this.R = arrayList3;
        this.X = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.A; i++) {
            WeakHashMap weakHashMap = aa7.a;
            ((View) this.B.get(i)).setTransitionName((String) this.L.get(i));
            ((View) this.R.get(i)).setTransitionName((String) this.X.get(i));
        }
    }
}
