package a0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import androidx.appcompat.widget.ActionMenuView;
import h1.p2;
import j0.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import l.e0;
import l.i0;
import p.w;
import w.l1;
import w.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l implements u3.a, w, l1 {
    public boolean A;
    public Object B;

    public l(boolean z10) {
        this.B = Collections.synchronizedList(new ArrayList());
        this.A = z10;
    }

    public static boolean c(x.j jVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) jVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i2 : iArr) {
                if (i2 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // u3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(long r5, long r7, cc.c r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof h1.c2
            if (r5 == 0) goto L13
            r5 = r9
            h1.c2 r5 = (h1.c2) r5
            int r6 = r5.Z
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.Z = r6
            goto L1a
        L13:
            h1.c2 r5 = new h1.c2
            ec.c r9 = (ec.c) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.X
            dc.a r9 = dc.a.COROUTINE_SUSPENDED
            int r0 = r5.Z
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            long r7 = r5.R
            p7.j.I(r6)
            goto L4f
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L32:
            p7.j.I(r6)
            boolean r6 = r4.A
            r2 = 0
            if (r6 == 0) goto L57
            java.lang.Object r6 = r4.B
            h1.p2 r6 = (h1.p2) r6
            boolean r0 = r6.f5997i
            if (r0 == 0) goto L44
            goto L53
        L44:
            r5.R = r7
            r5.Z = r1
            java.lang.Object r6 = r6.a(r7, r5)
            if (r6 != r9) goto L4f
            return r9
        L4f:
            x4.q r6 = (x4.q) r6
            long r2 = r6.f14352a
        L53:
            long r2 = x4.q.d(r7, r2)
        L57:
            x4.q r5 = new x4.q
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l.V(long, long, cc.c):java.lang.Object");
    }

    @Override // u3.a
    public long Z(long j2, long j10, int i2) {
        if (this.A) {
            p2 p2Var = (p2) this.B;
            if (!p2Var.f5989a.b()) {
                return p2Var.h(p2Var.d(p2Var.f5989a.e(p2Var.d(p2Var.g(j10)))));
            }
            return 0L;
        }
        return 0L;
    }

    @Override // p.w
    public void a(p.l lVar, boolean z10) {
        q.j jVar;
        e0 e0Var = (e0) this.B;
        if (this.A) {
            return;
        }
        this.A = true;
        ActionMenuView actionMenuView = e0Var.f8381l.f11964a.A;
        if (actionMenuView != null && (jVar = actionMenuView.f951q0) != null) {
            jVar.c();
            q.f fVar = jVar.f11925n0;
            if (fVar != null && fVar.b()) {
                fVar.f11172i.dismiss();
            }
        }
        e0Var.m.onPanelClosed(108, lVar);
        this.A = false;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        if (this.A) {
            k kVar = new k(0);
            b5.l lVar = (b5.l) kVar.f9b;
            ((List) this.B).add(lVar);
            Log.d("RequestMonitor", "RequestListener " + kVar + " monitoring " + this);
            lVar.B.a(new i(this, kVar, lVar, 0), ij.a.D());
            return new z(Arrays.asList(kVar, captureCallback));
        }
        return captureCallback;
    }

    public boolean e() {
        return this.A;
    }

    @Override // w.l1
    public void f(c0.f fVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(1.0f);
        q0 q0Var = q0.REQUIRED;
        fVar.e(key, valueOf, q0Var);
        if (this.A) {
            q0Var.getClass();
            if (Build.VERSION.SDK_INT >= 34) {
                key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                fVar.e(key2, 1, q0Var);
            }
        }
    }

    public ta.a g() {
        List list = (List) this.B;
        if (list.isEmpty()) {
            return m0.k.L;
        }
        m0.m mVar = new m0.m(new ArrayList(new ArrayList(list)), false, ij.a.D());
        j jVar = new j(0);
        return m0.i.d(m0.i.g(mVar, new i0(4, jVar), ij.a.D()));
    }

    public boolean h(int i2, CharSequence charSequence) {
        if (charSequence != null && i2 >= 0 && charSequence.length() - i2 >= 0) {
            x5.f fVar = (x5.f) this.B;
            if (fVar == null) {
                return e();
            }
            fVar.getClass();
            boolean z10 = true;
            for (int i10 = 0; i10 < i2 && z10; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                l lVar = x5.g.f14368a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case l1.c.f8512h /* 15 */:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            }
            if (!z10) {
                return true;
            }
            if (z10) {
                return false;
            }
            return e();
        }
        fj.j.b();
        return false;
    }

    @Override // w.l1
    public float i() {
        return ((Float) ((Range) this.B).getUpper()).floatValue();
    }

    @Override // w.l1
    public float j() {
        return ((Float) ((Range) this.B).getLower()).floatValue();
    }

    public void k() {
        this.A = false;
    }

    @Override // p.w
    public boolean l(p.l lVar) {
        ((e0) this.B).m.onMenuOpened(108, lVar);
        return true;
    }

    public void n(byte b10) {
        ((pd.n) this.B).writeLong(b10);
    }

    public void o(char c4) {
        ((pd.n) this.B).a(c4);
    }

    public void p(int i2) {
        ((pd.n) this.B).writeLong(i2);
    }

    public void q(long j2) {
        ((pd.n) this.B).writeLong(j2);
    }

    public void r(short s10) {
        ((pd.n) this.B).writeLong(s10);
    }

    public void s(String str) {
        str.getClass();
        ((pd.n) this.B).b(str);
    }

    public void u() {
        LinkedList linkedList = new LinkedList((List) this.B);
        while (!linkedList.isEmpty()) {
            ta.a aVar = (ta.a) linkedList.poll();
            Objects.requireNonNull(aVar);
            aVar.cancel(true);
        }
    }

    public /* synthetic */ l(Object obj, byte b10) {
        this.B = obj;
    }

    public /* synthetic */ l(boolean z10, Object obj) {
        this.B = obj;
        this.A = z10;
    }

    public l(String str, boolean z10) {
        this.A = z10;
        this.B = str;
    }

    public /* synthetic */ l(Object obj) {
        this.A = true;
        this.B = obj;
    }

    public l(x5.f fVar, boolean z10) {
        this(fVar, (byte) 0);
        this.A = z10;
    }

    @Override // w.l1
    public void m() {
    }

    public void t() {
    }

    public void v() {
    }

    @Override // w.l1
    public void b(TotalCaptureResult totalCaptureResult) {
    }
}
