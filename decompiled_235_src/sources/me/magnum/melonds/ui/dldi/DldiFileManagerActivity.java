package me.magnum.melonds.ui.dldi;

import android.os.Bundle;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DldiFileManagerActivity extends mv0 {
    public static final /* synthetic */ int r0 = 0;

    @Override // defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        File file = new File(getFilesDir(), "dldi/sync");
        file.mkdirs();
        nv0.a(this, new zv0(-973924382, true, new ql1(0, file, this)));
    }
}
