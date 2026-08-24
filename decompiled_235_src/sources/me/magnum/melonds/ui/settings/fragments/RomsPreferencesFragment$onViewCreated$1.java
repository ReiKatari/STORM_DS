package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import androidx.preference.Preference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1", f = "RomsPreferencesFragment.kt", l = {68}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RomsPreferencesFragment$onViewCreated$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ RomsPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @mc1(c = "me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1$1", f = "RomsPreferencesFragment.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends hw6 implements eo2 {
        public int X;
        public final /* synthetic */ RomsPreferencesFragment Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RomsPreferencesFragment romsPreferencesFragment, r41 r41Var) {
            super(2, r41Var);
            this.Y = romsPreferencesFragment;
        }

        @Override // defpackage.eo2
        public final Object o(Object obj, Object obj2) {
            return ((AnonymousClass1) q((r41) obj2, (w61) obj)).s(jg7.a);
        }

        @Override // defpackage.d20
        public final r41 q(r41 r41Var, Object obj) {
            return new AnonymousClass1(this.Y, r41Var);
        }

        @Override // defpackage.d20
        public final Object s(Object obj) {
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            int i = this.X;
            jg7 jg7Var = jg7.a;
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                    return jg7Var;
                }
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
            final RomsPreferencesFragment romsPreferencesFragment = this.Y;
            ud4 ud4Var = ((yz5) romsPreferencesFragment.Z.getValue()).b;
            cf2 cf2Var = new cf2(new td4(2, null, 0), f04.N(ud4Var.c));
            ne2 ne2Var = new ne2() { // from class: me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment.onViewCreated.1.1.1
                @Override // defpackage.ne2
                public final Object a(Object obj2, r41 r41Var) {
                    RomsPreferencesFragment romsPreferencesFragment2 = RomsPreferencesFragment.this;
                    Context requireContext = romsPreferencesFragment2.requireContext();
                    requireContext.getClass();
                    String x = oi2.x(requireContext, (lj6) obj2, 0);
                    Preference preference = romsPreferencesFragment2.h0;
                    if (preference != null) {
                        preference.setSummary(romsPreferencesFragment2.getString(R.string.cache_size, x));
                        return jg7.a;
                    }
                    nb3.a0("clearRomCachePreference");
                    throw null;
                }
            };
            this.X = 1;
            Object b = cf2Var.b(new zb0(14, ne2Var, ud4Var), this);
            if (b != x61Var) {
                b = jg7Var;
            }
            if (b == x61Var) {
                return x61Var;
            }
            return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RomsPreferencesFragment$onViewCreated$1(RomsPreferencesFragment romsPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.Y = romsPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((RomsPreferencesFragment$onViewCreated$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new RomsPreferencesFragment$onViewCreated$1(this.Y, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            RomsPreferencesFragment romsPreferencesFragment = this.Y;
            hu3 viewLifecycleOwner = romsPreferencesFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            tt3 tt3Var = tt3.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(romsPreferencesFragment, null);
            this.X = 1;
            if (np2.d0(viewLifecycleOwner, tt3Var, anonymousClass1, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
