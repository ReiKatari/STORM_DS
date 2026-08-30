package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.x;
import androidx.preference.Preference;
import cd.a0;
import cd.q;
import cd.v;
import h1.i1;
import kf.d1;
import mc.p;
import me.magnum.melonds.R;
import oe.o0;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1", f = "RomsPreferencesFragment.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RomsPreferencesFragment$onViewCreated$1 extends ec.j implements p {
    public int X;
    public final /* synthetic */ RomsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @ec.e(c = "me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1$1", f = "RomsPreferencesFragment.kt", l = {62}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends ec.j implements p {
        public int X;
        public final /* synthetic */ RomsPreferencesFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RomsPreferencesFragment romsPreferencesFragment, cc.c cVar) {
            super(2, cVar);
            this.Y = romsPreferencesFragment;
        }

        @Override // mc.p
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }

        @Override // ec.a
        public final cc.c t(cc.c cVar, Object obj) {
            return new AnonymousClass1(this.Y, cVar);
        }

        @Override // ec.a
        public final Object v(Object obj) {
            dc.a aVar = dc.a.COROUTINE_SUSPENDED;
            int i2 = this.X;
            y yVar = y.f14813a;
            if (i2 != 0) {
                if (i2 == 1) {
                    p7.j.I(obj);
                    return yVar;
                }
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p7.j.I(obj);
            final RomsPreferencesFragment romsPreferencesFragment = this.Y;
            d1 d1Var = ((gi.f) romsPreferencesFragment.Y.getValue()).f5680b;
            v vVar = new v(new i1(2, 1, null), q.x(d1Var.f8179c));
            cd.i iVar = new cd.i() { // from class: me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment.onViewCreated.1.1.1
                @Override // cd.i
                public final Object a(Object obj2, cc.c cVar) {
                    RomsPreferencesFragment romsPreferencesFragment2 = RomsPreferencesFragment.this;
                    Context requireContext = romsPreferencesFragment2.requireContext();
                    requireContext.getClass();
                    String S = d0.d.S(requireContext, (o0) obj2, 0);
                    Preference preference = romsPreferencesFragment2.f9603d0;
                    if (preference != null) {
                        preference.setSummary(romsPreferencesFragment2.getString(R.string.cache_size, S));
                        return y.f14813a;
                    }
                    nc.k.f("clearRomCachePreference");
                    throw null;
                }
            };
            this.X = 1;
            Object c4 = vVar.c(new a0(12, iVar, d1Var), this);
            if (c4 != aVar) {
                c4 = yVar;
            }
            if (c4 == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RomsPreferencesFragment$onViewCreated$1(RomsPreferencesFragment romsPreferencesFragment, cc.c cVar) {
        super(2, cVar);
        this.Y = romsPreferencesFragment;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((RomsPreferencesFragment$onViewCreated$1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new RomsPreferencesFragment$onViewCreated$1(this.Y, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            RomsPreferencesFragment romsPreferencesFragment = this.Y;
            x viewLifecycleOwner = romsPreferencesFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.q qVar = androidx.lifecycle.q.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(romsPreferencesFragment, null);
            this.X = 1;
            if (s0.j(viewLifecycleOwner, qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return y.f14813a;
    }
}
