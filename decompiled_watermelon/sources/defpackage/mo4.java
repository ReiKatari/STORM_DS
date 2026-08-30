package defpackage;

import android.widget.Magnifier;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mo4  reason: default package */
/* loaded from: classes.dex */
public class mo4 implements ko4 {
    public final Magnifier a;

    public mo4(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.ko4
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
