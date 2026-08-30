package me.magnum.melonds.ui.settings.fragments;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6", f = "RetroAchievementsPreferencesFragment.kt", l = {170}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$6 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ SwitchPreference Z;
    public final /* synthetic */ SwitchPreference c0;
    public final /* synthetic */ List d0;
    public final /* synthetic */ SwitchPreference e0;
    public final /* synthetic */ SwitchPreference f0;
    public final /* synthetic */ ListPreference g0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1", f = "RetroAchievementsPreferencesFragment.kt", l = {184}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends nk6 implements aj2 {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ SwitchPreference Z;
        public final /* synthetic */ SwitchPreference c0;
        public final /* synthetic */ List d0;
        public final /* synthetic */ SwitchPreference e0;
        public final /* synthetic */ SwitchPreference f0;
        public final /* synthetic */ ListPreference g0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$1", f = "RetroAchievementsPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00071 extends nk6 implements dj2 {
            public /* synthetic */ boolean X;
            public /* synthetic */ boolean Y;
            public /* synthetic */ boolean Z;
            public /* synthetic */ kd5 c0;

            /* JADX WARN: Type inference failed for: r4v2, types: [nk6, me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$1] */
            @Override // defpackage.dj2
            public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                ?? nk6Var = new nk6(5, (j11) obj5);
                nk6Var.X = booleanValue;
                nk6Var.Y = booleanValue2;
                nk6Var.Z = booleanValue3;
                nk6Var.c0 = (kd5) obj4;
                return nk6Var.v(o27.a);
            }

            @Override // defpackage.m00
            public final Object v(Object obj) {
                boolean z = this.X;
                boolean z2 = this.Y;
                boolean z3 = this.Z;
                kd5 kd5Var = this.c0;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return new RetroAchievementsPreferencesFragment.EndpointPreferenceState(z, z2, z3, kd5Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, SwitchPreference switchPreference, SwitchPreference switchPreference2, List list, SwitchPreference switchPreference3, SwitchPreference switchPreference4, ListPreference listPreference, j11 j11Var) {
            super(2, j11Var);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = switchPreference;
            this.c0 = switchPreference2;
            this.d0 = list;
            this.e0 = switchPreference3;
            this.f0 = switchPreference4;
            this.g0 = listPreference;
        }

        @Override // defpackage.aj2
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((j11) obj2, (o31) obj)).v(o27.a);
        }

        @Override // defpackage.m00
        public final j11 t(j11 j11Var, Object obj) {
            return new AnonymousClass1(this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, j11Var);
        }

        @Override // defpackage.m00
        public final Object v(Object obj) {
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            int i = this.X;
            o27 o27Var = o27.a;
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
                final ce6 ce6Var = (ce6) retroAchievementsPreferencesFragment.k().d.getValue();
                u92 u92Var = new u92() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
                    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public final class AnonymousClass2<T> implements w92 {
                        public final /* synthetic */ w92 A;

                        @v81(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2", f = "RetroAchievementsPreferencesFragment.kt", l = {50}, m = "emit", v = 2)
                        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: classes.dex */
                        public final class AnonymousClass1 extends k11 {
                            public /* synthetic */ Object R;
                            public int X;

                            public AnonymousClass1(j11 j11Var) {
                                super(j11Var);
                            }

                            @Override // defpackage.m00
                            public final Object v(Object obj) {
                                this.R = obj;
                                this.X |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.b(null, this);
                            }
                        }

                        public AnonymousClass2(w92 w92Var) {
                            this.A = w92Var;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
                        @Override // defpackage.w92
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object b(java.lang.Object r5, defpackage.j11 r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2$1 r0 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.X
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.X = r1
                                goto L18
                            L13:
                                me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2$1 r0 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.R
                                p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
                                int r2 = r0.X
                                r3 = 1
                                if (r2 == 0) goto L2e
                                if (r2 != r3) goto L27
                                defpackage.me2.a0(r6)
                                goto L44
                            L27:
                                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                                defpackage.i.n(r4)
                                r4 = 0
                                return r4
                            L2e:
                                defpackage.me2.a0(r6)
                                wc5 r5 = (defpackage.wc5) r5
                                boolean r5 = r5 instanceof defpackage.tc5
                                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                                r0.X = r3
                                w92 r4 = r4.A
                                java.lang.Object r4 = r4.b(r5, r0)
                                if (r4 != r1) goto L44
                                return r1
                            L44:
                                o27 r4 = defpackage.o27.a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$invokeSuspend$$inlined$map$1.AnonymousClass2.b(java.lang.Object, j11):java.lang.Object");
                        }
                    }

                    @Override // defpackage.u92
                    public final Object a(w92 w92Var, j11 j11Var) {
                        Object a = ce6Var.a(new AnonymousClass2(w92Var), j11Var);
                        if (a == p31.COROUTINE_SUSPENDED) {
                            return a;
                        }
                        return o27.a;
                    }
                };
                h90 k = se.k(new v74(this.Z, (j11) null, 5));
                final SwitchPreference switchPreference = this.c0;
                h90 k2 = se.k(new v74(switchPreference, (j11) null, 5));
                id5 id5Var = retroAchievementsPreferencesFragment.c0;
                if (id5Var != null) {
                    q45 q45Var = id5Var.d;
                    nk6 nk6Var = new nk6(5, null);
                    u92[] u92VarArr = {u92Var, k, k2, q45Var};
                    final SwitchPreference switchPreference2 = this.f0;
                    final ListPreference listPreference = this.g0;
                    final List list = this.d0;
                    final SwitchPreference switchPreference3 = this.e0;
                    w92 w92Var = new w92() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.6.1.2

                        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
                        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$6$1$2$WhenMappings */
                        /* loaded from: classes.dex */
                        public static final /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] a;

                            static {
                                int[] iArr = new int[jd5.values().length];
                                try {
                                    iArr[jd5.OFFICIAL.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[jd5.RA_OFFLINE_PROXY.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[jd5.RA_OFFLINE_PROXY_UNAVAILABLE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                a = iArr;
                            }
                        }

                        @Override // defpackage.w92
                        public final Object b(Object obj2, j11 j11Var) {
                            boolean z;
                            boolean z2;
                            boolean z3;
                            boolean z4;
                            String string;
                            RetroAchievementsPreferencesFragment.EndpointPreferenceState endpointPreferenceState = (RetroAchievementsPreferencesFragment.EndpointPreferenceState) obj2;
                            boolean z5 = endpointPreferenceState.a;
                            kd5 kd5Var = endpointPreferenceState.d;
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
                            if (kd5Var.b == qd5.BUILT_IN) {
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
                            int i2 = WhenMappings.a[kd5Var.c.ordinal()];
                            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = retroAchievementsPreferencesFragment;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        string = retroAchievementsPreferencesFragment2.getString(R.string.ra_offline_proxy_not_active);
                                    } else {
                                        defpackage.i.c();
                                        return null;
                                    }
                                } else {
                                    string = retroAchievementsPreferencesFragment2.getString(R.string.ra_offline_proxy_active_summary);
                                }
                            } else {
                                string = retroAchievementsPreferencesFragment2.getString(R.string.ra_offline_backend_summary);
                            }
                            listPreference.setSummary(string);
                            return o27.a;
                        }
                    };
                    this.X = 1;
                    Object G = n40.G(this, w92Var, ux.R, new dx1((j11) null, (wi2) nk6Var, 3), u92VarArr);
                    if (G != p31.COROUTINE_SUSPENDED) {
                        G = o27Var;
                    }
                    if (G == p31Var) {
                        return p31Var;
                    }
                } else {
                    b53.g0("endpointProvider");
                    throw null;
                }
            }
            return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$6(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, SwitchPreference switchPreference, SwitchPreference switchPreference2, List list, SwitchPreference switchPreference3, SwitchPreference switchPreference4, ListPreference listPreference, j11 j11Var) {
        super(2, j11Var);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = switchPreference;
        this.c0 = switchPreference2;
        this.d0 = list;
        this.e0 = switchPreference3;
        this.f0 = switchPreference4;
        this.g0 = listPreference;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$6) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$6(this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, j11Var);
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
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            rm3 lifecycle = retroAchievementsPreferencesFragment.getLifecycle();
            lifecycle.getClass();
            qm3 qm3Var = qm3.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, null);
            this.X = 1;
            if (nl2.Q(lifecycle, qm3Var, anonymousClass1, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
