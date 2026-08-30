package d2;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import b4.z2;
import f2.b1;
import l4.i0;
import l4.m0;
import l4.o0;
import l4.q0;
import q4.w;
import q4.x;
import u1.k1;
import u1.p0;
import y3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p {
    public static final int a(p0 p0Var, long j2, z2 z2Var) {
        long Q;
        int h2;
        k1 d4 = p0Var.d();
        if (d4 != null) {
            l4.q qVar = d4.f13358a.f8866b;
            z c4 = p0Var.c();
            if (c4 != null && (h2 = h(qVar, (Q = c4.Q(j2)), z2Var)) != -1) {
                return qVar.g(h3.b.a(Q, (qVar.b(h2) + qVar.f(h2)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long b(p0 p0Var, h3.c cVar, h3.c cVar2, int i2) {
        long i10 = i(p0Var, cVar, i2);
        if (q0.c(i10)) {
            return q0.f8883b;
        }
        long i11 = i(p0Var, cVar2, i2);
        if (q0.c(i11)) {
            return q0.f8883b;
        }
        int i12 = (int) (i10 >> 32);
        int i13 = (int) (i11 & 4294967295L);
        return i0.b(Math.min(i12, i12), Math.max(i13, i13));
    }

    public static final boolean c(o0 o0Var, int i2) {
        l4.q qVar = o0Var.f8866b;
        int d4 = qVar.d(i2);
        if (i2 == o0Var.f(d4) || i2 == qVar.c(d4, false) ? o0Var.g(i2) != o0Var.a(i2) : o0Var.a(i2) != o0Var.a(i2 - 1)) {
            return true;
        }
        return false;
    }

    public static final ExtractedText d(x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.f12276a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = xVar.f12277b;
        extractedText.selectionStart = q0.f(j2);
        extractedText.selectionEnd = q0.e(j2);
        extractedText.flags = !vc.h.Z(xVar.f12276a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long e(PointF pointF) {
        return (Float.floatToRawIntBits(pointF.x) << 32) | (Float.floatToRawIntBits(pointF.y) & 4294967295L);
    }

    public static final boolean f(h3.c cVar, float f8, float f10) {
        float f11 = cVar.f6052a;
        if (f8 <= cVar.f6054c && f11 <= f8) {
            float f12 = cVar.f6053b;
            if (f10 <= cVar.f6055d && f12 <= f10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int g(HandwritingGesture handwritingGesture, a2.c cVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.k(new q4.a(fallbackText, 1));
        return 5;
    }

    public static final int h(l4.q qVar, long j2, z2 z2Var) {
        float f8;
        if (z2Var != null) {
            f8 = z2Var.f();
        } else {
            f8 = 0.0f;
        }
        int i2 = (int) (4294967295L & j2);
        int e6 = qVar.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) >= qVar.f(e6) - f8 && Float.intBitsToFloat(i2) <= qVar.b(e6) + f8) {
            int i10 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i10) >= (-f8) && Float.intBitsToFloat(i10) <= qVar.f8878d + f8) {
                return e6;
            }
            return -1;
        }
        return -1;
    }

    public static final long i(p0 p0Var, h3.c cVar, int i2) {
        l4.q qVar;
        k1 d4 = p0Var.d();
        if (d4 != null) {
            qVar = d4.f13358a.f8866b;
        } else {
            qVar = null;
        }
        z c4 = p0Var.c();
        if (qVar != null && c4 != null) {
            return qVar.h(cVar.i(c4.Q(0L)), i2, m0.f8850b);
        }
        return q0.f8883b;
    }

    public static final boolean j(int i2) {
        int type = Character.getType(i2);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean k(int i2) {
        if (!Character.isWhitespace(i2) && i2 != 160) {
            return false;
        }
        return true;
    }

    public static final boolean l(int i2) {
        int type;
        if (k(i2) && (type = Character.getType(i2)) != 14 && type != 13 && i2 != 10) {
            return true;
        }
        return false;
    }

    public static final b3.p m(b3.p pVar, c cVar, p0 p0Var, b1 b1Var) {
        return pVar.f(new n(cVar, p0Var, b1Var));
    }

    public static void n(long j2, l4.h hVar, boolean z10, a2.c cVar) {
        int i2;
        if (z10) {
            int i10 = q0.f8884c;
            int i11 = (int) (j2 >> 32);
            int i12 = (int) (j2 & 4294967295L);
            int i13 = 10;
            if (i11 > 0) {
                i2 = Character.codePointBefore(hVar, i11);
            } else {
                i2 = 10;
            }
            if (i12 < hVar.B.length()) {
                i13 = Character.codePointAt(hVar, i12);
            }
            if (l(i2) && (k(i13) || j(i13))) {
                do {
                    i11 -= Character.charCount(i2);
                    if (i11 == 0) {
                        break;
                    }
                    i2 = Character.codePointBefore(hVar, i11);
                } while (l(i2));
                j2 = i0.b(i11, i12);
            } else if (l(i13) && (k(i2) || j(i2))) {
                do {
                    i12 += Character.charCount(i13);
                    if (i12 == hVar.B.length()) {
                        break;
                    }
                    i13 = Character.codePointAt(hVar, i12);
                } while (l(i13));
                j2 = i0.b(i11, i12);
            }
        }
        int i14 = (int) (4294967295L & j2);
        cVar.k(new l(new q4.g[]{new w(i14, i14), new q4.e(q0.d(j2), 0)}));
    }
}
