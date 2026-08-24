package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf5  reason: default package */
/* loaded from: classes.dex */
public final class lf5 implements InputConnection {
    public final s63 a;
    public final boolean b;
    public final jt3 c;
    public final p27 d;
    public final fo7 e;
    public int f;
    public c37 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public lf5(c37 c37Var, s63 s63Var, boolean z, jt3 jt3Var, p27 p27Var, fo7 fo7Var) {
        this.a = s63Var;
        this.b = z;
        this.c = jt3Var;
        this.d = p27Var;
        this.e = fo7Var;
        this.g = c37Var;
    }

    public final void a(ds1 ds1Var) {
        this.f++;
        try {
            this.j.add(ds1Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((kt3) this.a.B).c.g(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (z) {
            this.f++;
            return true;
        }
        return z;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((kt3) this.a.B).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (nb3.k(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        if (z) {
            return this.b;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new pu0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new hh1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new ih1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ds1, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (z) {
            a(new Object());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        c37 c37Var = this.g;
        return TextUtils.getCapsMode(c37Var.a.B, k47.f(c37Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.i = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.h = i2;
        }
        return oi2.g(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (k47.c(this.g.b)) {
            return null;
        }
        return ln2.A(this.g).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return ln2.C(this.g, i).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return ln2.D(this.g, i).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    a(new dd6(0, this.g.a.B.length()));
                    break;
                case 16908320:
                    c(277);
                    return false;
                case 16908321:
                    c(278);
                    return false;
                case 16908322:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((kt3) this.a.B).d.g(new k33(i2));
            }
            i2 = 1;
            ((kt3) this.a.B).d.g(new k33(i2));
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, bh5] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, bh5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        fp fpVar;
        fp fpVar2;
        PointF startPoint;
        PointF endPoint;
        ?? r16;
        long j;
        int i;
        PointF insertionPoint;
        b47 d;
        String textToInsert;
        PointF joinOrSplitPoint;
        b47 d2;
        int granularity;
        int i2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        int i3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        z37 z37Var;
        if (Build.VERSION.SDK_INT >= 34) {
            bg2 bg2Var = new bg2(this, 27);
            jt3 jt3Var = this.c;
            int i4 = 3;
            if (jt3Var != null && (fpVar = jt3Var.j) != null) {
                b47 d3 = jt3Var.d();
                a47 a47Var = null;
                if (d3 != null && (z37Var = d3.a.a) != null) {
                    fpVar2 = z37Var.a;
                } else {
                    fpVar2 = null;
                }
                if (fpVar.equals(fpVar2)) {
                    boolean s = qv2.s(handwritingGesture);
                    boolean z = false;
                    int i5 = 0;
                    boolean z2 = false;
                    int i6 = 0;
                    p27 p27Var = this.d;
                    if (s) {
                        SelectGesture p = qv2.p(handwritingGesture);
                        selectionArea = p.getSelectionArea();
                        of5 b0 = ej2.b0(selectionArea);
                        granularity4 = p.getGranularity();
                        if (granularity4 == 1) {
                            i5 = 1;
                        }
                        long H = kn2.H(jt3Var, b0, i5);
                        if (k47.c(H)) {
                            i4 = bl2.w(qv2.l(p), bg2Var);
                        } else {
                            bg2Var.g(new dd6((int) (H >> 32), (int) (H & 4294967295L)));
                            if (p27Var != null) {
                                p27Var.h(true);
                            }
                            i4 = 1;
                        }
                    } else if (qv2.D(handwritingGesture)) {
                        DeleteGesture k = qv2.k(handwritingGesture);
                        granularity3 = k.getGranularity();
                        if (granularity3 != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        deletionArea = k.getDeletionArea();
                        long H2 = kn2.H(jt3Var, ej2.b0(deletionArea), i3);
                        if (k47.c(H2)) {
                            i4 = bl2.w(qv2.l(k), bg2Var);
                        } else {
                            if (i3 == 1) {
                                z2 = true;
                            }
                            bl2.M(H2, fpVar, z2, bg2Var);
                            i4 = 1;
                        }
                    } else if (rv2.m(handwritingGesture)) {
                        SelectRangeGesture j2 = rv2.j(handwritingGesture);
                        selectionStartArea = j2.getSelectionStartArea();
                        of5 b02 = ej2.b0(selectionStartArea);
                        selectionEndArea = j2.getSelectionEndArea();
                        of5 b03 = ej2.b0(selectionEndArea);
                        granularity2 = j2.getGranularity();
                        if (granularity2 == 1) {
                            i6 = 1;
                        }
                        long m = kn2.m(jt3Var, b02, b03, i6);
                        if (k47.c(m)) {
                            i4 = bl2.w(qv2.l(j2), bg2Var);
                        } else {
                            bg2Var.g(new dd6((int) (m >> 32), (int) (m & 4294967295L)));
                            if (p27Var != null) {
                                p27Var.h(true);
                            }
                            i4 = 1;
                        }
                    } else if (rv2.q(handwritingGesture)) {
                        DeleteRangeGesture i7 = rv2.i(handwritingGesture);
                        granularity = i7.getGranularity();
                        if (granularity != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        deletionStartArea = i7.getDeletionStartArea();
                        of5 b04 = ej2.b0(deletionStartArea);
                        deletionEndArea = i7.getDeletionEndArea();
                        long m2 = kn2.m(jt3Var, b04, ej2.b0(deletionEndArea), i2);
                        if (k47.c(m2)) {
                            i4 = bl2.w(qv2.l(i7), bg2Var);
                        } else {
                            if (i2 == 1) {
                                z = true;
                            }
                            bl2.M(m2, fpVar, z, bg2Var);
                            i4 = 1;
                        }
                    } else {
                        boolean C = qv2.C(handwritingGesture);
                        fo7 fo7Var = this.e;
                        if (C) {
                            JoinOrSplitGesture n = qv2.n(handwritingGesture);
                            if (fo7Var != null) {
                                joinOrSplitPoint = n.getJoinOrSplitPoint();
                                int l = kn2.l(jt3Var, kn2.p(joinOrSplitPoint), fo7Var);
                                if (l != -1 && ((d2 = jt3Var.d()) == null || !kn2.n(d2.a, l))) {
                                    int i8 = l;
                                    while (i8 > 0) {
                                        int codePointBefore = Character.codePointBefore(fpVar, i8);
                                        if (!kn2.P(codePointBefore)) {
                                            break;
                                        }
                                        i8 -= Character.charCount(codePointBefore);
                                    }
                                    while (l < fpVar.B.length()) {
                                        int codePointAt = Character.codePointAt(fpVar, l);
                                        if (!kn2.P(codePointAt)) {
                                            break;
                                        }
                                        l += Character.charCount(codePointAt);
                                    }
                                    long f = jx2.f(i8, l);
                                    if (k47.c(f)) {
                                        int i9 = (int) (f >> 32);
                                        bg2Var.g(new sv2(new ds1[]{new dd6(i9, i9), new pu0(" ", 1)}));
                                    } else {
                                        bl2.M(f, fpVar, false, bg2Var);
                                    }
                                    i4 = 1;
                                } else {
                                    i4 = bl2.w(qv2.l(n), bg2Var);
                                }
                            } else {
                                i4 = bl2.w(qv2.y(n), bg2Var);
                            }
                        } else if (qv2.z(handwritingGesture)) {
                            InsertGesture m3 = qv2.m(handwritingGesture);
                            if (fo7Var != null) {
                                insertionPoint = m3.getInsertionPoint();
                                int l2 = kn2.l(jt3Var, kn2.p(insertionPoint), fo7Var);
                                if (l2 != -1 && ((d = jt3Var.d()) == null || !kn2.n(d.a, l2))) {
                                    textToInsert = m3.getTextToInsert();
                                    bg2Var.g(new sv2(new ds1[]{new dd6(l2, l2), new pu0(textToInsert, 1)}));
                                    i4 = 1;
                                } else {
                                    i4 = bl2.w(qv2.l(m3), bg2Var);
                                }
                            } else {
                                i4 = bl2.w(qv2.y(m3), bg2Var);
                            }
                        } else if (qv2.B(handwritingGesture)) {
                            RemoveSpaceGesture o = qv2.o(handwritingGesture);
                            b47 d4 = jt3Var.d();
                            if (d4 != null) {
                                a47Var = d4.a;
                            }
                            startPoint = o.getStartPoint();
                            long p2 = kn2.p(startPoint);
                            endPoint = o.getEndPoint();
                            long p3 = kn2.p(endPoint);
                            jk3 c = jt3Var.c();
                            if (a47Var != null) {
                                v84 v84Var = a47Var.b;
                                if (c != null) {
                                    long N = c.N(p2);
                                    long N2 = c.N(p3);
                                    int F = kn2.F(v84Var, N, fo7Var);
                                    int F2 = kn2.F(v84Var, N2, fo7Var);
                                    if (F == -1) {
                                        if (F2 == -1) {
                                            j = k47.b;
                                            r16 = ' ';
                                            if (k47.c(j)) {
                                                i4 = bl2.w(qv2.l(o), bg2Var);
                                            } else {
                                                ?? obj = new Object();
                                                obj.A = -1;
                                                ?? obj2 = new Object();
                                                obj2.A = -1;
                                                String e = new xh5("\\s+").e(fpVar.subSequence(k47.f(j), k47.e(j)).B, new bi2(7, obj, obj2));
                                                int i10 = obj.A;
                                                if (i10 != -1 && (i = obj2.A) != -1) {
                                                    int i11 = (int) (j >> r16);
                                                    bg2Var.g(new sv2(new ds1[]{new dd6(i11 + i10, i11 + i), new pu0(e.substring(i10, e.length() - (k47.d(j) - obj2.A)), 1)}));
                                                    i4 = 1;
                                                } else {
                                                    i4 = bl2.w(qv2.l(o), bg2Var);
                                                }
                                            }
                                        }
                                    } else {
                                        if (F2 != -1) {
                                            F = Math.min(F, F2);
                                        }
                                        F2 = F;
                                    }
                                    float b = (v84Var.b(F2) + v84Var.f(F2)) / 2.0f;
                                    int i12 = (int) (N >> 32);
                                    int i13 = (int) (N2 >> 32);
                                    r16 = ' ';
                                    j = v84Var.h(new of5(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), b - 0.1f, Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), b + 0.1f), 0, cs1.n0);
                                    if (k47.c(j)) {
                                    }
                                }
                            }
                            r16 = ' ';
                            j = k47.b;
                            if (k47.c(j)) {
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                }
            }
            if (intConsumer != null) {
                if (executor != null) {
                    executor.execute(new om(intConsumer, i4, 1));
                } else {
                    intConsumer.accept(i4);
                }
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        jt3 jt3Var;
        fp fpVar;
        fp fpVar2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        int i;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i2;
        RectF deletionArea;
        int granularity3;
        int i3;
        RectF selectionArea;
        int granularity4;
        int i4;
        z37 z37Var;
        if (Build.VERSION.SDK_INT >= 34 && (jt3Var = this.c) != null && (fpVar = jt3Var.j) != null) {
            b47 d = jt3Var.d();
            if (d != null && (z37Var = d.a.a) != null) {
                fpVar2 = z37Var.a;
            } else {
                fpVar2 = null;
            }
            if (fpVar.equals(fpVar2)) {
                boolean s = qv2.s(previewableHandwritingGesture);
                p27 p27Var = this.d;
                if (s) {
                    SelectGesture p = qv2.p(previewableHandwritingGesture);
                    if (p27Var != null) {
                        selectionArea = p.getSelectionArea();
                        of5 b0 = ej2.b0(selectionArea);
                        granularity4 = p.getGranularity();
                        if (granularity4 != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long H = kn2.H(jt3Var, b0, i4);
                        jt3 jt3Var2 = p27Var.d;
                        if (jt3Var2 != null) {
                            jt3Var2.f(H);
                        }
                        jt3 jt3Var3 = p27Var.d;
                        if (jt3Var3 != null) {
                            jt3Var3.e(k47.b);
                        }
                        if (!k47.c(H)) {
                            p27Var.t(false);
                            p27Var.q(hv2.None);
                        }
                    }
                } else if (qv2.D(previewableHandwritingGesture)) {
                    DeleteGesture k = qv2.k(previewableHandwritingGesture);
                    if (p27Var != null) {
                        deletionArea = k.getDeletionArea();
                        of5 b02 = ej2.b0(deletionArea);
                        granularity3 = k.getGranularity();
                        if (granularity3 != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        long H2 = kn2.H(jt3Var, b02, i3);
                        jt3 jt3Var4 = p27Var.d;
                        if (jt3Var4 != null) {
                            jt3Var4.e(H2);
                        }
                        jt3 jt3Var5 = p27Var.d;
                        if (jt3Var5 != null) {
                            jt3Var5.f(k47.b);
                        }
                        if (!k47.c(H2)) {
                            p27Var.t(false);
                            p27Var.q(hv2.None);
                        }
                    }
                } else if (rv2.m(previewableHandwritingGesture)) {
                    SelectRangeGesture j = rv2.j(previewableHandwritingGesture);
                    if (p27Var != null) {
                        selectionStartArea = j.getSelectionStartArea();
                        of5 b03 = ej2.b0(selectionStartArea);
                        selectionEndArea = j.getSelectionEndArea();
                        of5 b04 = ej2.b0(selectionEndArea);
                        granularity2 = j.getGranularity();
                        if (granularity2 != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long m = kn2.m(jt3Var, b03, b04, i2);
                        jt3 jt3Var6 = p27Var.d;
                        if (jt3Var6 != null) {
                            jt3Var6.f(m);
                        }
                        jt3 jt3Var7 = p27Var.d;
                        if (jt3Var7 != null) {
                            jt3Var7.e(k47.b);
                        }
                        if (!k47.c(m)) {
                            p27Var.t(false);
                            p27Var.q(hv2.None);
                        }
                    }
                } else if (rv2.q(previewableHandwritingGesture)) {
                    DeleteRangeGesture i5 = rv2.i(previewableHandwritingGesture);
                    if (p27Var != null) {
                        deletionStartArea = i5.getDeletionStartArea();
                        of5 b05 = ej2.b0(deletionStartArea);
                        deletionEndArea = i5.getDeletionEndArea();
                        of5 b06 = ej2.b0(deletionEndArea);
                        granularity = i5.getGranularity();
                        if (granularity != 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        long m2 = kn2.m(jt3Var, b05, b06, i);
                        jt3 jt3Var8 = p27Var.d;
                        if (jt3Var8 != null) {
                            jt3Var8.e(m2);
                        }
                        jt3 jt3Var9 = p27Var.d;
                        if (jt3Var9 != null) {
                            jt3Var9.f(k47.b);
                        }
                        if (!k47.c(m2)) {
                            p27Var.t(false);
                            p27Var.q(hv2.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ex0(p27Var, 1));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ft3 ft3Var;
        boolean z6;
        boolean z7 = this.k;
        if (z7) {
            boolean z8 = false;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                if ((i & 16) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i & 8) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i & 4) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i2 >= 34 && (i & 32) != 0) {
                    z8 = true;
                }
                if (!z4 && !z5 && !z6 && !z8) {
                    if (i2 >= 34) {
                        z3 = true;
                        z8 = true;
                    } else {
                        z3 = z8;
                        z8 = true;
                    }
                    z4 = z8;
                } else {
                    z3 = z8;
                    z8 = z6;
                    ft3Var = ((kt3) this.a.B).m;
                    synchronized (ft3Var.c) {
                        try {
                            ft3Var.f = z4;
                            ft3Var.g = z5;
                            ft3Var.h = z8;
                            ft3Var.i = z3;
                            if (z) {
                                ft3Var.e = true;
                                if (ft3Var.j != null) {
                                    ft3Var.a();
                                }
                            }
                            ft3Var.d = z2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                }
            } else {
                z3 = false;
                z4 = true;
            }
            z5 = z4;
            ft3Var = ((kt3) this.a.B).m;
            synchronized (ft3Var.c) {
            }
        } else {
            return z7;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (z) {
            ((BaseInputConnection) ((kt3) this.a.B).k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new bd6(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new cd6(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new dd6(i, i2));
            return true;
        }
        return z;
    }
}
