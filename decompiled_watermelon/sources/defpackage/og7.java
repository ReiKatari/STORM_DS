package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: og7  reason: default package */
/* loaded from: classes.dex */
public final class og7 implements ng7 {
    public final pd1 b;

    public og7() {
        pd1 pd1Var;
        if (Build.VERSION.SDK_INT >= 34) {
            pd1Var = qd1.A;
        } else {
            pd1Var = sn1.c0;
        }
        this.b = pd1Var;
        l07.n(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
