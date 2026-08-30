package d2;

import a6.g2;
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
import b4.z2;
import f2.b1;
import i3.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l4.n0;
import l4.q0;
import q4.w;
import q4.x;
import u1.d0;
import u1.k1;
import u1.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final t f3785a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3786b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f3787c;

    /* renamed from: d  reason: collision with root package name */
    public final b1 f3788d;

    /* renamed from: e  reason: collision with root package name */
    public final z2 f3789e;

    /* renamed from: f  reason: collision with root package name */
    public int f3790f;

    /* renamed from: g  reason: collision with root package name */
    public x f3791g;

    /* renamed from: h  reason: collision with root package name */
    public int f3792h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3793i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3794j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f3795k = true;

    public v(x xVar, t tVar, boolean z10, p0 p0Var, b1 b1Var, z2 z2Var) {
        this.f3785a = tVar;
        this.f3786b = z10;
        this.f3787c = p0Var;
        this.f3788d = b1Var;
        this.f3789e = z2Var;
        this.f3791g = xVar;
    }

    public final void a(q4.g gVar) {
        this.f3790f++;
        try {
            this.f3794j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i2 = this.f3790f - 1;
        this.f3790f = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f3794j;
            if (!arrayList.isEmpty()) {
                ((u) this.f3785a.B).f3775c.k(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f3790f > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f3795k;
        if (z10) {
            this.f3790f++;
            return true;
        }
        return z10;
    }

    public final void c(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        boolean z10 = this.f3795k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3794j.clear();
        this.f3790f = 0;
        this.f3795k = false;
        ArrayList arrayList = ((u) this.f3785a.B).f3782j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (nc.k.a(((WeakReference) arrayList.get(i2)).get(), this)) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f3795k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z10 = this.f3795k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f3795k;
        if (z10) {
            return this.f3786b;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new q4.a(String.valueOf(charSequence), i2));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i10) {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new q4.e(i2, i10));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i10) {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new q4.f(i2, i10));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [q4.g, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new Object());
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        x xVar = this.f3791g;
        return TextUtils.getCapsMode(xVar.f12276a.B, q0.f(xVar.f12277b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z10 = true;
        int i10 = 0;
        if ((i2 & 1) == 0) {
            z10 = false;
        }
        this.f3793i = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i10 = extractedTextRequest.token;
            }
            this.f3792h = i10;
        }
        return p.d(this.f3791g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (q0.c(this.f3791g.f12277b)) {
            return null;
        }
        return p7.t.m(this.f3791g).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i10) {
        return p7.t.p(this.f3791g, i2).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i10) {
        return p7.t.q(this.f3791g, i2).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z10 = this.f3795k;
        if (z10) {
            z10 = false;
            switch (i2) {
                case 16908319:
                    a(new w(0, this.f3791g.f12276a.B.length()));
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
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i10;
        boolean z10 = this.f3795k;
        if (z10) {
            z10 = true;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        i10 = 2;
                        break;
                    case 3:
                        i10 = 3;
                        break;
                    case 4:
                        i10 = 4;
                        break;
                    case l1.c.f8511g /* 5 */:
                        i10 = 6;
                        break;
                    case l1.c.f8509e /* 6 */:
                        i10 = 7;
                        break;
                    case 7:
                        i10 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                        break;
                }
                ((u) this.f3785a.B).f3776d.k(new q4.i(i10));
            }
            i10 = 1;
            ((u) this.f3785a.B).f3776d.k(new q4.i(i10));
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r20, java.util.concurrent.Executor r21, java.util.function.IntConsumer r22) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.v.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f3795k;
        if (z10) {
            return true;
        }
        return z10;
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        p0 p0Var;
        l4.h hVar;
        l4.h hVar2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        int i2;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i10;
        RectF deletionArea;
        int granularity3;
        int i11;
        RectF selectionArea;
        int granularity4;
        int i12;
        n0 n0Var;
        if (Build.VERSION.SDK_INT >= 34 && (p0Var = this.f3787c) != null && (hVar = p0Var.f13388j) != null) {
            k1 d4 = p0Var.d();
            if (d4 != null && (n0Var = d4.f13358a.f8865a) != null) {
                hVar2 = n0Var.f8853a;
            } else {
                hVar2 = null;
            }
            if (hVar.equals(hVar2)) {
                boolean r5 = g2.r(previewableHandwritingGesture);
                b1 b1Var = this.f3788d;
                if (r5) {
                    SelectGesture m = g2.m(previewableHandwritingGesture);
                    if (b1Var != null) {
                        selectionArea = m.getSelectionArea();
                        h3.c B = z.B(selectionArea);
                        granularity4 = m.getGranularity();
                        if (granularity4 != 1) {
                            i12 = 0;
                        } else {
                            i12 = 1;
                        }
                        long i13 = p.i(p0Var, B, i12);
                        p0 p0Var2 = b1Var.f4709d;
                        if (p0Var2 != null) {
                            p0Var2.f(i13);
                        }
                        p0 p0Var3 = b1Var.f4709d;
                        if (p0Var3 != null) {
                            p0Var3.e(q0.f8883b);
                        }
                        if (!q0.c(i13)) {
                            b1Var.t(false);
                            b1Var.q(d0.None);
                        }
                    }
                } else if (j.v(previewableHandwritingGesture)) {
                    DeleteGesture n10 = j.n(previewableHandwritingGesture);
                    if (b1Var != null) {
                        deletionArea = n10.getDeletionArea();
                        h3.c B2 = z.B(deletionArea);
                        granularity3 = n10.getGranularity();
                        if (granularity3 != 1) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        long i14 = p.i(p0Var, B2, i11);
                        p0 p0Var4 = b1Var.f4709d;
                        if (p0Var4 != null) {
                            p0Var4.e(i14);
                        }
                        p0 p0Var5 = b1Var.f4709d;
                        if (p0Var5 != null) {
                            p0Var5.f(q0.f8883b);
                        }
                        if (!q0.c(i14)) {
                            b1Var.t(false);
                            b1Var.q(d0.None);
                        }
                    }
                } else if (j.B(previewableHandwritingGesture)) {
                    SelectRangeGesture p10 = j.p(previewableHandwritingGesture);
                    if (b1Var != null) {
                        selectionStartArea = p10.getSelectionStartArea();
                        h3.c B3 = z.B(selectionStartArea);
                        selectionEndArea = p10.getSelectionEndArea();
                        h3.c B4 = z.B(selectionEndArea);
                        granularity2 = p10.getGranularity();
                        if (granularity2 != 1) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        long b10 = p.b(p0Var, B3, B4, i10);
                        p0 p0Var6 = b1Var.f4709d;
                        if (p0Var6 != null) {
                            p0Var6.f(b10);
                        }
                        p0 p0Var7 = b1Var.f4709d;
                        if (p0Var7 != null) {
                            p0Var7.e(q0.f8883b);
                        }
                        if (!q0.c(b10)) {
                            b1Var.t(false);
                            b1Var.q(d0.None);
                        }
                    }
                } else if (j.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture o5 = j.o(previewableHandwritingGesture);
                    if (b1Var != null) {
                        deletionStartArea = o5.getDeletionStartArea();
                        h3.c B5 = z.B(deletionStartArea);
                        deletionEndArea = o5.getDeletionEndArea();
                        h3.c B6 = z.B(deletionEndArea);
                        granularity = o5.getGranularity();
                        if (granularity != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long b11 = p.b(p0Var, B5, B6, i2);
                        p0 p0Var8 = b1Var.f4709d;
                        if (p0Var8 != null) {
                            p0Var8.e(b11);
                        }
                        p0 p0Var9 = b1Var.f4709d;
                        if (p0Var9 != null) {
                            p0Var9.f(q0.f8883b);
                        }
                        if (!q0.c(b11)) {
                            b1Var.t(false);
                            b1Var.q(d0.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new k(0, b1Var));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
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
            boolean r0 = r9.f3795k
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
            d2.t r4 = r9.f3785a
            java.lang.Object r4 = r4.B
            d2.u r4 = (d2.u) r4
            d2.q r4 = r4.m
            java.lang.Object r7 = r4.f3757c
            monitor-enter(r7)
            r4.f3760f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f3761g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f3762h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f3763i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f3759e = r2     // Catch: java.lang.Throwable -> L6f
            q4.x r10 = r4.f3764j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f3758d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.v.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yb.f, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f3795k;
        if (z10) {
            ((BaseInputConnection) ((u) this.f3785a.B).f3783k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i10) {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new q4.u(i2, i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new q4.v(String.valueOf(charSequence), i2));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i10) {
        boolean z10 = this.f3795k;
        if (z10) {
            a(new w(i2, i10));
            return true;
        }
        return z10;
    }
}
