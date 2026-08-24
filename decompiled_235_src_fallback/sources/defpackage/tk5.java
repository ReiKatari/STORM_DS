package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk5  reason: default package */
/* loaded from: classes.dex */
public final class tk5 extends java.lang.Thread {
    public final int A;

    public tk5(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "fonts-androidx"
            r1.<init>(r2, r0)
            r2 = 10
            r1.A = r2
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
    }
}
