package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze7  reason: default package */
/* loaded from: classes.dex */
public final class ze7 {
    public ye7 a;

    public ze7(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new xe7(ve7.i(i, interpolator, j));
        } else {
            this.a = new ye7(i, interpolator, j);
        }
    }
}
