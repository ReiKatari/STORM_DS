package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u84  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u84 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;

    public /* synthetic */ u84(int i, int i2, int[] iArr) {
        this.A = 1;
        this.B = i;
        this.L = i2;
        this.R = iArr;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        String str;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        int i2 = this.L;
        int i3 = this.B;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                hj hjVar = (hj) obj2;
                yr4 yr4Var = (yr4) obj;
                cj cjVar = yr4Var.a;
                int d = yr4Var.d(i3);
                int d2 = yr4Var.d(i2);
                CharSequence charSequence = cjVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    StringBuilder q = i61.q(d, d2, "start(", ") or end(", ") is out of range [0..");
                    q.append(charSequence.length());
                    q.append("], or start > end!");
                    q53.a(q.toString());
                }
                Path path = new Path();
                y37 y37Var = cjVar.d;
                y37Var.f.getSelectionPath(d, d2, path);
                int i4 = y37Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(RecyclerView.B1, i4);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(yr4Var.f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits)));
                path.transform(matrix);
                hjVar.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                return jg7Var;
            case 1:
                int[] iArr = (int[]) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                String str2 = (String) key;
                Object value = entry.getValue();
                value.getClass();
                vr4 vr4Var = (vr4) value;
                int q2 = (gi2.q(((Number) vr4Var.B).intValue(), 0, i2 - 1) * i3) + gi2.q(((Number) vr4Var.A).intValue(), 0, i3 - 1);
                if (q2 >= 0 && q2 < iArr.length) {
                    String hexString = Long.toHexString(iArr[q2] & 4294967295L);
                    hexString.getClass();
                    String B0 = qs6.B0(8, hexString);
                    Locale locale = Locale.US;
                    locale.getClass();
                    str = B0.toUpperCase(locale);
                    str.getClass();
                } else {
                    str = "out";
                }
                return lb1.m(str2, ":", str);
            default:
                qn2 qn2Var = (qn2) obj2;
                sh2 sh2Var = (sh2) obj;
                sh2Var.getClass();
                if (sh2Var.isFocused()) {
                    qn2Var.g(Integer.valueOf(i3));
                } else if (i2 == i3) {
                    qn2Var.g(-1);
                }
                return jg7Var;
        }
    }

    public /* synthetic */ u84(Object obj, int i, int i2, int i3) {
        this.A = i3;
        this.R = obj;
        this.B = i;
        this.L = i2;
    }
}
