package androidx.fragment.app;

import android.os.Handler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s0 extends r0 {
    public final l.i A;
    public final l.i B;
    public final Handler L;
    public final h1 R;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.h1, androidx.fragment.app.g1] */
    public s0(l.i iVar) {
        Handler handler = new Handler();
        this.A = iVar;
        this.B = iVar;
        this.L = handler;
        this.R = new g1();
    }
}
