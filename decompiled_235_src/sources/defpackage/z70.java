package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z70  reason: default package */
/* loaded from: classes.dex */
public interface z70 {
    public static final y70 a = y70.a;

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= RecyclerView.B1 && f4 <= f3) || (f < RecyclerView.B1 && f4 > f3)) {
            return RecyclerView.B1;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) < Math.abs(f5)) {
            return f;
        }
        return f5;
    }
}
