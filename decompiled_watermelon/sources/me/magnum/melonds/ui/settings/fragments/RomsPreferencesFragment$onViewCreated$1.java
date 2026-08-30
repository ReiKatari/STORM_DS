package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1", f = "RomsPreferencesFragment.kt", l = {68}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RomsPreferencesFragment$onViewCreated$1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ RomsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1$1", f = "RomsPreferencesFragment.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends nk6 implements aj2 {
        public int X;
        public final /* synthetic */ RomsPreferencesFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RomsPreferencesFragment romsPreferencesFragment, j11 j11Var) {
            super(2, j11Var);
            this.Y = romsPreferencesFragment;
        }

        @Override // defpackage.aj2
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((j11) obj2, (o31) obj)).v(o27.a);
        }

        @Override // defpackage.m00
        public final j11 t(j11 j11Var, Object obj) {
            return new AnonymousClass1(this.Y, j11Var);
        }

        @Override // defpackage.m00
        public final Object v(Object obj) {
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            int i = this.X;
            o27 o27Var = o27.a;
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                    return o27Var;
                }
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            me2.a0(obj);
            final RomsPreferencesFragment romsPreferencesFragment = this.Y;
            o54 o54Var = ((dp5) romsPreferencesFragment.Z.getValue()).b;
            la2 la2Var = new la2(new n54(2, 0, null), se.Q(o54Var.c));
            w92 w92Var = new w92() { // from class: me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment.onViewCreated.1.1.1
                @Override // defpackage.w92
                public final Object b(Object obj2, j11 j11Var) {
                    RomsPreferencesFragment romsPreferencesFragment2 = RomsPreferencesFragment.this;
                    Context requireContext = romsPreferencesFragment2.requireContext();
                    requireContext.getClass();
                    String N = gk2.N(requireContext, (w76) obj2, 0);
                    Preference preference = romsPreferencesFragment2.g0;
                    if (preference != null) {
                        preference.setSummary(romsPreferencesFragment2.getString(R.string.cache_size, N));
                        return o27.a;
                    }
                    b53.g0("clearRomCachePreference");
                    throw null;
                }
            };
            this.X = 1;
            Object a = la2Var.a(new r90(14, w92Var, o54Var), this);
            if (a != p31Var) {
                a = o27Var;
            }
            if (a == p31Var) {
                return p31Var;
            }
            return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RomsPreferencesFragment$onViewCreated$1(RomsPreferencesFragment romsPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Y = romsPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((RomsPreferencesFragment$onViewCreated$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new RomsPreferencesFragment$onViewCreated$1(this.Y, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            RomsPreferencesFragment romsPreferencesFragment = this.Y;
            fn3 viewLifecycleOwner = romsPreferencesFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            qm3 qm3Var = qm3.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(romsPreferencesFragment, null);
            this.X = 1;
            if (nl2.R(viewLifecycleOwner, qm3Var, anonymousClass1, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
