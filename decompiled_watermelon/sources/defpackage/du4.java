package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: du4  reason: default package */
/* loaded from: classes.dex */
public final class du4 implements fn3 {
    public static final du4 d0 = new du4();
    public int A;
    public int B;
    public Handler X;
    public boolean L = true;
    public boolean R = true;
    public final in3 Y = new in3(this, true);
    public final tm3 Z = new tm3(5, this);
    public final ka3 c0 = new ka3(26, this);

    public final void a() {
        int i = this.B + 1;
        this.B = i;
        if (i == 1) {
            if (this.L) {
                this.Y.f(pm3.ON_RESUME);
                this.L = false;
                return;
            }
            Handler handler = this.X;
            handler.getClass();
            handler.removeCallbacks(this.Z);
        }
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        return this.Y;
    }
}
