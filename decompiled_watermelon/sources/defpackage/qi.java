package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qi  reason: default package */
/* loaded from: classes.dex */
public final class qi {
    public final ui a;
    public final int b;
    public final long c;
    public final jr6 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qi(defpackage.ui r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.<init>(ui, int, int, long):void");
    }

    public final jr6 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        qo4 qo4Var;
        float d = d();
        ui uiVar = this.a;
        yl ylVar = uiVar.g;
        int i8 = uiVar.l;
        gf3 gf3Var = uiVar.i;
        ds6 ds6Var = uiVar.b;
        ri riVar = si.a;
        dp4 dp4Var = ds6Var.c;
        if (dp4Var != null && (qo4Var = dp4Var.b) != null) {
            z = qo4Var.a;
        } else {
            z = false;
        }
        return new jr6(charSequence, d, ylVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, gf3Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [vh] */
    public final long c(y55 y55Var, int i, vd6 vd6Var) {
        boolean z;
        ey5 nn2Var;
        int i2;
        int[] iArr;
        SegmentFinder j;
        RectF U = ve2.U(y55Var);
        if (i != 0 && i == 1) {
            z = true;
        } else {
            z = false;
        }
        final z5 z5Var = new z5(2, vd6Var);
        jr6 jr6Var = this.d;
        TextPaint textPaint = jr6Var.a;
        Layout layout = jr6Var.f;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            if (z) {
                j = new kp(new wv6(8, layout.getText(), jr6Var.j()));
            } else {
                uh.m();
                j = uh.j(uh.i(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(U, j, new Layout.TextInclusionStrategy() { // from class: vh
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) z5.this.j(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            r9 c = jr6Var.c();
            if (z) {
                nn2Var = new wv6(8, layout.getText(), jr6Var.j());
            } else {
                CharSequence text = layout.getText();
                if (i3 >= 29) {
                    nn2Var = new mn2(text, textPaint);
                } else {
                    nn2Var = new nn2(text);
                }
            }
            ey5 ey5Var = nn2Var;
            int lineForVertical = layout.getLineForVertical((int) U.top);
            if (U.top <= jr6Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < jr6Var.g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) U.bottom);
                if (lineForVertical2 != 0 || U.bottom >= jr6Var.g(0)) {
                    int C = me2.C(jr6Var, layout, c, i4, U, ey5Var, z5Var, true);
                    while (true) {
                        i2 = i4;
                        if (C != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i4 = i2 + 1;
                        C = me2.C(jr6Var, layout, c, i4, U, ey5Var, z5Var, true);
                    }
                    if (C != -1) {
                        int i5 = lineForVertical2;
                        int C2 = me2.C(jr6Var, layout, c, i5, U, ey5Var, z5Var, false);
                        while (C2 == -1 && i2 < i5) {
                            i5--;
                            C2 = me2.C(jr6Var, layout, c, i5, U, ey5Var, z5Var, false);
                        }
                        if (C2 != -1) {
                            iArr = new int[]{ey5Var.a(C + 1), ey5Var.b(C2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return vr6.b;
        }
        return ve2.g(iArr[0], iArr[1]);
    }

    public final float d() {
        return lz0.h(this.c);
    }

    public final void e(oh0 oh0Var) {
        Canvas a = jd.a(oh0Var);
        jr6 jr6Var = this.d;
        if (jr6Var.d) {
            a.save();
            a.clipRect(RecyclerView.A1, RecyclerView.A1, d(), b());
        }
        int i = jr6Var.h;
        if (a.getClipBounds(jr6Var.p)) {
            if (i != 0) {
                a.translate(RecyclerView.A1, i);
            }
            ThreadLocal threadLocal = or6.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            mn6 mn6Var = (mn6) obj;
            mn6Var.a = a;
            try {
                jr6Var.f.draw(mn6Var);
                if (i != 0) {
                    a.translate(RecyclerView.A1, (-1.0f) * i);
                }
            } finally {
                mn6Var.a = null;
            }
        }
        if (jr6Var.d) {
            a.restore();
        }
    }

    public final void f(oh0 oh0Var, long j, u26 u26Var, qo6 qo6Var, ik1 ik1Var) {
        yl ylVar = this.a.g;
        int i = ylVar.c;
        ylVar.d(j);
        ylVar.f(u26Var);
        ylVar.g(qo6Var);
        ylVar.e(ik1Var);
        ylVar.b(3);
        e(oh0Var);
        ylVar.b(i);
    }

    public final void g(oh0 oh0Var, b60 b60Var, float f, u26 u26Var, qo6 qo6Var, ik1 ik1Var) {
        yl ylVar = this.a.g;
        int i = ylVar.c;
        float d = d();
        float b = b();
        ylVar.c(b60Var, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        ylVar.f(u26Var);
        ylVar.g(qo6Var);
        ylVar.e(ik1Var);
        ylVar.b(3);
        e(oh0Var);
        ylVar.b(i);
    }
}
