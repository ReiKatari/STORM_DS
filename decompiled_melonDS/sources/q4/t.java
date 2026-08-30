package q4;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.i0;
import l4.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f12261a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12262b;

    /* renamed from: c  reason: collision with root package name */
    public int f12263c;

    /* renamed from: d  reason: collision with root package name */
    public x f12264d;

    /* renamed from: e  reason: collision with root package name */
    public int f12265e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12266f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f12267g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f12268h = true;

    public t(x xVar, i0 i0Var, boolean z10) {
        this.f12261a = i0Var;
        this.f12262b = z10;
        this.f12264d = xVar;
    }

    public final void a(g gVar) {
        this.f12263c++;
        try {
            this.f12267g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i2 = this.f12263c - 1;
        this.f12263c = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f12267g;
            if (!arrayList.isEmpty()) {
                ((b0) this.f12261a.B).f12214e.k(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f12263c > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f12268h;
        if (z10) {
            this.f12263c++;
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
        boolean z10 = this.f12268h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f12267g.clear();
        this.f12263c = 0;
        this.f12268h = false;
        ArrayList arrayList = ((b0) this.f12261a.B).f12218i;
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
        boolean z10 = this.f12268h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z10 = this.f12268h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f12268h;
        if (z10) {
            return this.f12262b;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z10 = this.f12268h;
        if (z10) {
            a(new a(String.valueOf(charSequence), i2));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i10) {
        boolean z10 = this.f12268h;
        if (z10) {
            a(new e(i2, i10));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i10) {
        boolean z10 = this.f12268h;
        if (z10) {
            a(new f(i2, i10));
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
        boolean z10 = this.f12268h;
        if (z10) {
            a(new Object());
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        x xVar = this.f12264d;
        return TextUtils.getCapsMode(xVar.f12276a.B, q0.f(xVar.f12277b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z10 = true;
        int i10 = 0;
        if ((i2 & 1) == 0) {
            z10 = false;
        }
        this.f12266f = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i10 = extractedTextRequest.token;
            }
            this.f12265e = i10;
        }
        return zb.k.M(this.f12264d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (q0.c(this.f12264d.f12277b)) {
            return null;
        }
        return p7.t.m(this.f12264d).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i10) {
        return p7.t.p(this.f12264d, i2).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i10) {
        return p7.t.q(this.f12264d, i2).B;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z10 = this.f12268h;
        if (z10) {
            z10 = false;
            switch (i2) {
                case 16908319:
                    a(new w(0, this.f12264d.f12276a.B.length()));
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
        boolean z10 = this.f12268h;
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
                ((b0) this.f12261a.B).f12215f.k(new i(i10));
            }
            i10 = 1;
            ((b0) this.f12261a.B).f12215f.k(new i(i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f12268h;
        if (z10) {
            return true;
        }
        return z10;
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
            boolean r0 = r9.f12268h
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
            l.i0 r4 = r9.f12261a
            java.lang.Object r4 = r4.B
            q4.b0 r4 = (q4.b0) r4
            q4.c r4 = r4.f12221l
            java.lang.Object r7 = r4.f12225c
            monitor-enter(r7)
            r4.f12228f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f12229g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f12230h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f12231i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f12227e = r2     // Catch: java.lang.Throwable -> L6f
            q4.x r10 = r4.f12232j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f12226d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.t.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yb.f, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f12268h;
        if (z10) {
            ((BaseInputConnection) ((b0) this.f12261a.B).f12219j.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i10) {
        boolean z10 = this.f12268h;
        if (z10) {
            a(new u(i2, i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z10 = this.f12268h;
        if (z10) {
            a(new v(String.valueOf(charSequence), i2));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i10) {
        boolean z10 = this.f12268h;
        if (z10) {
            a(new w(i2, i10));
            return true;
        }
        return z10;
    }
}
