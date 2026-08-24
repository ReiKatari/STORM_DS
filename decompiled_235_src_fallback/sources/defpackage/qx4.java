package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx4  reason: default package */
/* loaded from: classes.dex */
public class qx4 implements defpackage.ox4 {
    public final android.widget.Magnifier a;

    public qx4(android.widget.Magnifier r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.ox4
    public void a(long r3, long r5) {
            r2 = this;
            android.widget.Magnifier r2 = r2.a
            r5 = 32
            long r5 = r3 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r2.show(r5, r3)
            return
    }

    public final void b() {
            r0 = this;
            android.widget.Magnifier r0 = r0.a
            r0.dismiss()
            return
    }

    public final long c() {
            r6 = this;
            android.widget.Magnifier r0 = r6.a
            int r0 = r0.getWidth()
            android.widget.Magnifier r6 = r6.a
            int r6 = r6.getHeight()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public final void d() {
            r0 = this;
            android.widget.Magnifier r0 = r0.a
            r0.update()
            return
    }
}
