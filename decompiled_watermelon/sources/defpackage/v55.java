package defpackage;

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
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v55  reason: default package */
/* loaded from: classes.dex */
public final class v55 implements InputConnection {
    public final ka3 a;
    public final boolean b;
    public final hm3 c;
    public final bq6 d;
    public final fa7 e;
    public int f;
    public oq6 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public v55(oq6 oq6Var, ka3 ka3Var, boolean z, hm3 hm3Var, bq6 bq6Var, fa7 fa7Var) {
        this.a = ka3Var;
        this.b = z;
        this.c = hm3Var;
        this.d = bq6Var;
        this.e = fa7Var;
        this.g = oq6Var;
    }

    public final void a(tn1 tn1Var) {
        this.f++;
        try {
            this.j.add(tn1Var);
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
                ((im3) this.a.B).c.n(new ArrayList(arrayList));
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
        ArrayList arrayList = ((im3) this.a.B).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (b53.x(((WeakReference) arrayList.get(i)).get(), this)) {
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
            a(new cs0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new fd1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new gd1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [tn1, java.lang.Object] */
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
        oq6 oq6Var = this.g;
        return TextUtils.getCapsMode(oq6Var.a.B, vr6.f(oq6Var.b), i);
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
        return me2.e(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (vr6.c(this.g.b)) {
            return null;
        }
        return io2.J(this.g).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return io2.L(this.g, i).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return io2.M(this.g, i).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    a(new p16(0, this.g.a.B.length()));
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
                    case ig7.b /* 6 */:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((im3) this.a.B).d.n(new gx2(i2));
            }
            i2 = 1;
            ((im3) this.a.B).d.n(new gx2(i2));
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02dc  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r19, java.util.concurrent.Executor r20, java.util.function.IntConsumer r21) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v55.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
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
        hm3 hm3Var;
        to toVar;
        to toVar2;
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
        kr6 kr6Var;
        if (Build.VERSION.SDK_INT >= 34 && (hm3Var = this.c) != null && (toVar = hm3Var.j) != null) {
            mr6 d = hm3Var.d();
            if (d != null && (kr6Var = d.a.a) != null) {
                toVar2 = kr6Var.a;
            } else {
                toVar2 = null;
            }
            if (toVar.equals(toVar2)) {
                boolean t = uh.t(previewableHandwritingGesture);
                bq6 bq6Var = this.d;
                if (t) {
                    SelectGesture n = pp2.n(previewableHandwritingGesture);
                    if (bq6Var != null) {
                        selectionArea = n.getSelectionArea();
                        y55 V = ve2.V(selectionArea);
                        granularity4 = n.getGranularity();
                        if (granularity4 != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long F = cg2.F(hm3Var, V, i4);
                        hm3 hm3Var2 = bq6Var.d;
                        if (hm3Var2 != null) {
                            hm3Var2.f(F);
                        }
                        hm3 hm3Var3 = bq6Var.d;
                        if (hm3Var3 != null) {
                            hm3Var3.e(vr6.b);
                        }
                        if (!vr6.c(F)) {
                            bq6Var.t(false);
                            bq6Var.q(gp2.None);
                        }
                    }
                } else if (pp2.B(previewableHandwritingGesture)) {
                    DeleteGesture h = pp2.h(previewableHandwritingGesture);
                    if (bq6Var != null) {
                        deletionArea = h.getDeletionArea();
                        y55 V2 = ve2.V(deletionArea);
                        granularity3 = h.getGranularity();
                        if (granularity3 != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        long F2 = cg2.F(hm3Var, V2, i3);
                        hm3 hm3Var4 = bq6Var.d;
                        if (hm3Var4 != null) {
                            hm3Var4.e(F2);
                        }
                        hm3 hm3Var5 = bq6Var.d;
                        if (hm3Var5 != null) {
                            hm3Var5.f(vr6.b);
                        }
                        if (!vr6.c(F2)) {
                            bq6Var.t(false);
                            bq6Var.q(gp2.None);
                        }
                    }
                } else if (pp2.C(previewableHandwritingGesture)) {
                    SelectRangeGesture o = pp2.o(previewableHandwritingGesture);
                    if (bq6Var != null) {
                        selectionStartArea = o.getSelectionStartArea();
                        y55 V3 = ve2.V(selectionStartArea);
                        selectionEndArea = o.getSelectionEndArea();
                        y55 V4 = ve2.V(selectionEndArea);
                        granularity2 = o.getGranularity();
                        if (granularity2 != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long q = cg2.q(hm3Var, V3, V4, i2);
                        hm3 hm3Var6 = bq6Var.d;
                        if (hm3Var6 != null) {
                            hm3Var6.f(q);
                        }
                        hm3 hm3Var7 = bq6Var.d;
                        if (hm3Var7 != null) {
                            hm3Var7.e(vr6.b);
                        }
                        if (!vr6.c(q)) {
                            bq6Var.t(false);
                            bq6Var.q(gp2.None);
                        }
                    }
                } else if (pp2.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture i5 = pp2.i(previewableHandwritingGesture);
                    if (bq6Var != null) {
                        deletionStartArea = i5.getDeletionStartArea();
                        y55 V5 = ve2.V(deletionStartArea);
                        deletionEndArea = i5.getDeletionEndArea();
                        y55 V6 = ve2.V(deletionEndArea);
                        granularity = i5.getGranularity();
                        if (granularity != 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        long q2 = cg2.q(hm3Var, V5, V6, i);
                        hm3 hm3Var8 = bq6Var.d;
                        if (hm3Var8 != null) {
                            hm3Var8.e(q2);
                        }
                        hm3 hm3Var9 = bq6Var.d;
                        if (hm3Var9 != null) {
                            hm3Var9.f(vr6.b);
                        }
                        if (!vr6.c(q2)) {
                            bq6Var.t(false);
                            bq6Var.q(gp2.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new iu0(1, bq6Var));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            ka3 r9 = r9.a
            java.lang.Object r9 = r9.B
            im3 r9 = (defpackage.im3) r9
            dm3 r9 = r9.m
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            oq6 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v55.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (z) {
            ((BaseInputConnection) ((im3) this.a.B).k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new n16(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new o16(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new p16(i, i2));
            return true;
        }
        return z;
    }
}
