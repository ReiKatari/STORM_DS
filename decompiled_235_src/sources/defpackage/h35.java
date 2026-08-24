package defpackage;

import android.os.Handler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h35  reason: default package */
/* loaded from: classes.dex */
public final class h35 implements hu3 {
    public static final h35 e0 = new h35();
    public int A;
    public int B;
    public Handler X;
    public boolean L = true;
    public boolean R = true;
    public final ku3 Y = new ku3(this, true);
    public final rk3 Z = new rk3(this, 7);
    public final s63 d0 = new s63(this, 29);

    public final void a() {
        int i = this.B + 1;
        this.B = i;
        if (i == 1) {
            if (this.L) {
                this.Y.f(st3.ON_RESUME);
                this.L = false;
                return;
            }
            Handler handler = this.X;
            handler.getClass();
            handler.removeCallbacks(this.Z);
        }
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        return this.Y;
    }
}
