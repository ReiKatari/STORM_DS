package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v50  reason: default package */
/* loaded from: classes.dex */
public interface v50 {
    public static final u50 a = u50.a;

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= RecyclerView.A1 && f4 <= f3) || (f < RecyclerView.A1 && f4 > f3)) {
            return RecyclerView.A1;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) < Math.abs(f5)) {
            return f;
        }
        return f5;
    }
}
