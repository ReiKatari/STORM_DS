package me.magnum.melonds.ui.settings.fragments;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.stormds.emulator.R;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6", f = "RetroAchievementsPreferencesFragment.kt", l = {170}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$6 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ SwitchPreference Z;
    public final /* synthetic */ SwitchPreference d0;
    public final /* synthetic */ List e0;
    public final /* synthetic */ SwitchPreference f0;
    public final /* synthetic */ SwitchPreference g0;
    public final /* synthetic */ ListPreference h0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1", f = "RetroAchievementsPreferencesFragment.kt", l = {184}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends hw6 implements eo2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ SwitchPreference Z;
        public final /* synthetic */ SwitchPreference d0;
        public final /* synthetic */ List e0;
        public final /* synthetic */ SwitchPreference f0;
        public final /* synthetic */ SwitchPreference g0;
        public final /* synthetic */ ListPreference h0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$1", f = "RetroAchievementsPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00071 extends hw6 implements ho2 {
            public /* synthetic */ boolean X;
            public /* synthetic */ boolean Y;
            public /* synthetic */ boolean Z;
            public /* synthetic */ en5 d0;

            /* JADX WARN: Type inference failed for: r4v2, types: [hw6, me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$1] */
            @Override // defpackage.ho2
            public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                ?? hw6Var = new hw6(5, (r41) obj5);
                hw6Var.X = booleanValue;
                hw6Var.Y = booleanValue2;
                hw6Var.Z = booleanValue3;
                hw6Var.d0 = (en5) obj4;
                return hw6Var.s(jg7.a);
            }

            @Override // defpackage.d20
            public final Object s(Object obj) {
                boolean z = this.X;
                boolean z2 = this.Y;
                boolean z3 = this.Z;
                en5 en5Var = this.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new RetroAchievementsPreferencesFragment.EndpointPreferenceState(z, z2, z3, en5Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, SwitchPreference switchPreference, SwitchPreference switchPreference2, List list, SwitchPreference switchPreference3, SwitchPreference switchPreference4, ListPreference listPreference, r41 r41Var) {
            super(2, r41Var);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = switchPreference;
            this.d0 = switchPreference2;
            this.e0 = list;
            this.f0 = switchPreference3;
            this.g0 = switchPreference4;
            this.h0 = listPreference;
        }

        @Override // defpackage.eo2
        public final Object o(Object obj, Object obj2) {
            return ((AnonymousClass1) q((r41) obj2, (w61) obj)).s(jg7.a);
        }

        @Override // defpackage.d20
        public final r41 q(r41 r41Var, Object obj) {
            return new AnonymousClass1(this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, r41Var);
        }

        @Override // defpackage.d20
        public final Object s(Object obj) {
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            int i = this.X;
            jg7 jg7Var = jg7.a;
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                } else {
                    defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
                final rp6 rp6Var = (rp6) retroAchievementsPreferencesFragment.k().d.getValue();
                le2 le2Var = new le2() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
                    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public final class AnonymousClass2<T> implements ne2 {
                        public final /* synthetic */ ne2 A;

                        @mc1(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2", f = "RetroAchievementsPreferencesFragment.kt", l = {50}, m = "emit", v = 2)
                        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: classes.dex */
                        public final class AnonymousClass1 extends s41 {
                            public /* synthetic */ Object R;
                            public int X;

                            public AnonymousClass1(r41 r41Var) {
                                super(r41Var);
                            }

                            @Override // defpackage.d20
                            public final Object s(Object obj) {
                                this.R = obj;
                                this.X |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.a(null, this);
                            }
                        }

                        public AnonymousClass2(ne2 ne2Var) {
                            this.A = ne2Var;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
                        @Override // defpackage.ne2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object a(Object obj, r41 r41Var) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (r41Var instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) r41Var;
                                int i2 = anonymousClass1.X;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.X = i2 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.R;
                                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.X;
                                    if (i == 0) {
                                        if (i == 1) {
                                            oi2.Y(obj2);
                                        } else {
                                            defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        oi2.Y(obj2);
                                        Boolean valueOf = Boolean.valueOf(((qm5) obj) instanceof nm5);
                                        anonymousClass1.X = 1;
                                        if (this.A.a(valueOf, anonymousClass1) == x61Var) {
                                            return x61Var;
                                        }
                                    }
                                    return jg7.a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(r41Var);
                            Object obj22 = anonymousClass1.R;
                            x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                            i = anonymousClass1.X;
                            if (i == 0) {
                            }
                            return jg7.a;
                        }
                    }

                    @Override // defpackage.le2
                    public final Object b(ne2 ne2Var, r41 r41Var) {
                        Object b = rp6Var.b(new AnonymousClass2(ne2Var), r41Var);
                        if (b == x61.COROUTINE_SUSPENDED) {
                            return b;
                        }
                        return jg7.a;
                    }
                };
                pb0 p = f04.p(new bf4(this.Z, null, 6));
                final SwitchPreference switchPreference = this.d0;
                pb0 p2 = f04.p(new bf4(switchPreference, null, 6));
                cn5 cn5Var = retroAchievementsPreferencesFragment.d0;
                if (cn5Var != null) {
                    de5 de5Var = cn5Var.d;
                    hw6 hw6Var = new hw6(5, null);
                    le2[] le2VarArr = {le2Var, p, p2, de5Var};
                    final SwitchPreference switchPreference2 = this.g0;
                    final ListPreference listPreference = this.h0;
                    final List list = this.e0;
                    final SwitchPreference switchPreference3 = this.f0;
                    ne2 ne2Var = new ne2() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.6.1.2

                        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
                        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$2$WhenMappings */
                        /* loaded from: classes.dex */
                        public static final /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] a;

                            static {
                                int[] iArr = new int[dn5.values().length];
                                try {
                                    iArr[dn5.OFFICIAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[dn5.RA_OFFLINE_PROXY.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[dn5.RA_OFFLINE_PROXY_UNAVAILABLE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                a = iArr;
                            }
                        }

                        @Override // defpackage.ne2
                        public final Object a(Object obj2, r41 r41Var) {
                            boolean z;
                            boolean z2;
                            boolean z3;
                            boolean z4;
                            String string;
                            RetroAchievementsPreferencesFragment.EndpointPreferenceState endpointPreferenceState = (RetroAchievementsPreferencesFragment.EndpointPreferenceState) obj2;
                            boolean z5 = endpointPreferenceState.a;
                            en5 en5Var = endpointPreferenceState.d;
                            boolean z6 = endpointPreferenceState.b;
                            boolean z7 = endpointPreferenceState.c;
                            boolean z8 = false;
                            if (z5 && z6) {
                                z = true;
                            } else {
                                z = false;
                            }
                            for (Preference preference : list) {
                                preference.setVisible(z);
                            }
                            if (en5Var.b == ln5.BUILT_IN) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z && z2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            switchPreference.setVisible(z3);
                            if (z && z2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            switchPreference3.setVisible(z4);
                            if (z && !z7 && z2) {
                                z8 = true;
                            }
                            switchPreference2.setVisible(z8);
                            int i2 = WhenMappings.a[en5Var.c.ordinal()];
                            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = retroAchievementsPreferencesFragment;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        string = retroAchievementsPreferencesFragment2.getString(R.string.ra_offline_proxy_not_active);
                                    } else {
                                        defpackage.i.d();
                                        return null;
                                    }
                                } else {
                                    string = retroAchievementsPreferencesFragment2.getString(R.string.ra_offline_proxy_active_summary);
                                }
                            } else {
                                string = retroAchievementsPreferencesFragment2.getString(R.string.ra_offline_backend_summary);
                            }
                            listPreference.setSummary(string);
                            return jg7.a;
                        }
                    };
                    this.X = 1;
                    Object o = nb3.o(this, ne2Var, jz.R, new o12((r41) null, (ao2) hw6Var, 3), le2VarArr);
                    if (o != x61.COROUTINE_SUSPENDED) {
                        o = jg7Var;
                    }
                    if (o == x61Var) {
                        return x61Var;
                    }
                } else {
                    nb3.a0("endpointProvider");
                    throw null;
                }
            }
            return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$6(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, SwitchPreference switchPreference, SwitchPreference switchPreference2, List list, SwitchPreference switchPreference3, SwitchPreference switchPreference4, ListPreference listPreference, r41 r41Var) {
        super(2, r41Var);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = switchPreference;
        this.d0 = switchPreference2;
        this.e0 = list;
        this.f0 = switchPreference3;
        this.g0 = switchPreference4;
        this.h0 = listPreference;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$6) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$6(this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, r41Var);
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
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            ut3 lifecycle = retroAchievementsPreferencesFragment.getLifecycle();
            lifecycle.getClass();
            tt3 tt3Var = tt3.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, null);
            this.X = 1;
            if (np2.c0(lifecycle, tt3Var, anonymousClass1, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
