package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p04  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p04 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;

    public /* synthetic */ p04(int i, int i2, int[] iArr) {
        this.A = 1;
        this.B = i;
        this.L = i2;
        this.R = iArr;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        String str;
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.L;
        int i3 = this.B;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                vi viVar = (vi) obj2;
                wi4 wi4Var = (wi4) obj;
                qi qiVar = wi4Var.a;
                int d = wi4Var.d(i3);
                int d2 = wi4Var.d(i2);
                CharSequence charSequence = qiVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    StringBuilder s = b31.s(d, d2, "start(", ") or end(", ") is out of range [0..");
                    s.append(charSequence.length());
                    s.append("], or start > end!");
                    nz2.a(s.toString());
                }
                Path path = new Path();
                jr6 jr6Var = qiVar.d;
                jr6Var.f.getSelectionPath(d, d2, path);
                int i4 = jr6Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(RecyclerView.A1, i4);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(wi4Var.f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits)));
                path.transform(matrix);
                viVar.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                return o27Var;
            case 1:
                int[] iArr = (int[]) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                String str2 = (String) key;
                Object value = entry.getValue();
                value.getClass();
                ti4 ti4Var = (ti4) value;
                int m = (io2.m(((Number) ti4Var.B).intValue(), 0, i2 - 1) * i3) + io2.m(((Number) ti4Var.A).intValue(), 0, i3 - 1);
                if (m >= 0 && m < iArr.length) {
                    String hexString = Long.toHexString(iArr[m] & 4294967295L);
                    hexString.getClass();
                    String H0 = zg6.H0(8, hexString);
                    Locale locale = Locale.US;
                    locale.getClass();
                    str = H0.toUpperCase(locale);
                    str.getClass();
                } else {
                    str = "out";
                }
                return wh1.l(str2, ":", str);
            default:
                mi2 mi2Var = (mi2) obj2;
                bd2 bd2Var = (bd2) obj;
                bd2Var.getClass();
                if (bd2Var.isFocused()) {
                    mi2Var.n(Integer.valueOf(i3));
                } else if (i2 == i3) {
                    mi2Var.n(-1);
                }
                return o27Var;
        }
    }

    public /* synthetic */ p04(Object obj, int i, int i2, int i3) {
        this.A = i3;
        this.R = obj;
        this.B = i;
        this.L = i2;
    }
}
