package defpackage;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nf6  reason: default package */
/* loaded from: classes.dex */
public final class nf6 {
    public final ig4 a;
    public final LinkedHashMap b;
    public final dz4 c;

    public nf6(StreamConfigurationMap streamConfigurationMap, ig4 ig4Var) {
        dz4 dz4Var;
        ig4Var.getClass();
        this.a = ig4Var;
        this.b = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        if (Build.VERSION.SDK_INT >= 34) {
            dz4Var = new dz4(streamConfigurationMap);
        } else {
            dz4Var = new dz4(streamConfigurationMap);
        }
        this.c = dz4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r3.equalsIgnoreCase("Motorola") != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Size[] a(int r30) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf6.a(int):android.util.Size[]");
    }
}
