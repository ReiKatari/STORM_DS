package me.magnum.melonds.ui.dldi;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DldiFileManagerActivity extends defpackage.mv0 {
    public static final /* synthetic */ int r0 = 0;

    public DldiFileManagerActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            java.io.File r4 = new java.io.File
            java.io.File r0 = r3.getFilesDir()
            java.lang.String r1 = "dldi/sync"
            r4.<init>(r0, r1)
            r4.mkdirs()
            ql1 r0 = new ql1
            r1 = 0
            r0.<init>(r1, r4, r3)
            zv0 r4 = new zv0
            r1 = -973924382(0xffffffffc5f317e2, float:-7778.9854)
            r2 = 1
            r4.<init>(r1, r2, r0)
            defpackage.nv0.a(r3, r4)
            return
    }
}
