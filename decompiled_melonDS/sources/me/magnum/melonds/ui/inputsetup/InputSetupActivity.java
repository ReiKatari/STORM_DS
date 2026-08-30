package me.magnum.melonds.ui.inputsetup;

import a7.a;
import a7.v;
import ah.i1;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.lifecycle.a1;
import androidx.lifecycle.s0;
import d.c0;
import d.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kb.b;
import l.i;
import mb.c;
import nc.u;
import oe.s;
import oe.t;
import ph.d;
import ph.f;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class InputSetupActivity extends i implements c {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ int f9520z0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile b f9521u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Object f9522v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9523w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public final v f9524x0;

    /* renamed from: y0  reason: collision with root package name */
    public final LinkedHashMap f9525y0;

    public InputSetupActivity() {
        q(new i1(this, 7));
        this.f9524x0 = new v(u.a(f.class), new d(this, 1), new d(this, 0), new d(this, 2));
        this.f9525y0 = new LinkedHashMap();
    }

    public final f A() {
        return (f) this.f9524x0.getValue();
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        z().c();
    }

    @Override // mb.b
    public final Object d() {
        return z().d();
    }

    @Override // l.i, m5.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && A().f11655f.A.getValue() != null && keyEvent.getKeyCode() != 4) {
            f A = A();
            int keyCode = keyEvent.getKeyCode();
            s sVar = (s) A.f11654e.getValue();
            if (sVar != null) {
                A.f(sVar, new oe.v(keyCode, null));
                A.e(sVar);
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // d.k, androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return k0.d.w(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n.a(this, new c0(0, 0, new a(14)));
        B(bundle);
        e.f.a(this, new v2.c(1790543048, true, new ph.a(this, 0)));
        x.v(s0.f(this), null, null, new ph.c(this, null, 1), 3);
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Integer num;
        t tVar;
        motionEvent.getClass();
        if (A().f11655f.A.getValue() != null && motionEvent.isFromSource(16) && motionEvent.getAction() == 2) {
            LinkedHashMap linkedHashMap = this.f9525y0;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (Math.abs(motionEvent.getAxisValue(((Number) entry.getKey()).intValue()) - ((Number) entry.getValue()).floatValue()) >= 0.5f) {
                        num = (Integer) entry.getKey();
                        continue;
                    } else {
                        num = null;
                        continue;
                    }
                    if (num != null) {
                        break;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            if (num != null) {
                Object obj = linkedHashMap.get(num);
                obj.getClass();
                if (motionEvent.getAxisValue(num.intValue()) - ((Number) obj).floatValue() > 0.0f) {
                    tVar = t.POSITIVE;
                } else {
                    tVar = t.NEGATIVE;
                }
                f A = A();
                int intValue = num.intValue();
                tVar.getClass();
                s sVar = (s) A.f11654e.getValue();
                if (sVar != null) {
                    A.f(sVar, new oe.u(null, intValue, tVar));
                    A.e(sVar);
                    return true;
                }
                return true;
            }
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final b z() {
        if (this.f9521u0 == null) {
            synchronized (this.f9522v0) {
                try {
                    if (this.f9521u0 == null) {
                        this.f9521u0 = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9521u0;
    }
}
