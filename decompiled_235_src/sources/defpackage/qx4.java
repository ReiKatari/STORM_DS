package defpackage;

import android.widget.Magnifier;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx4  reason: default package */
/* loaded from: classes.dex */
public class qx4 implements ox4 {
    public final Magnifier a;

    public qx4(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.ox4
    public void a(long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (this.a.getWidth() << 32) | (this.a.getHeight() & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
