package me.magnum.melonds.ui.settings.fragments;

import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.preference.SwitchPreference;
import cd.o1;
import cd.t0;
import cd.v0;
import mc.p;
import mc.q;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4", f = "RetroAchievementsPreferencesFragment.kt", l = {88}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RetroAchievementsPreferencesFragment$onCreatePreferences$4 extends ec.j implements p {
    public int X;
    public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
    public final /* synthetic */ SwitchPreference Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ SwitchPreference f9599b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1", f = "RetroAchievementsPreferencesFragment.kt", l = {92}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends ec.j implements p {
        public int X;
        public final /* synthetic */ RetroAchievementsPreferencesFragment Y;
        public final /* synthetic */ SwitchPreference Z;

        /* renamed from: b0  reason: collision with root package name */
        public final /* synthetic */ SwitchPreference f9600b0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
        @ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$1", f = "RetroAchievementsPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00071 extends ec.j implements q {
            public /* synthetic */ boolean X;
            public /* synthetic */ boolean Y;

            /* JADX WARN: Type inference failed for: r0v0, types: [ec.j, me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$1] */
            @Override // mc.q
            public final Object i(Object obj, Object obj2, Object obj3) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ?? jVar = new ec.j(3, (cc.c) obj3);
                jVar.X = booleanValue;
                jVar.Y = booleanValue2;
                return jVar.v(y.f14813a);
            }

            @Override // ec.a
            public final Object v(Object obj) {
                boolean z10;
                boolean z11 = this.X;
                boolean z12 = this.Y;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (z11 && !z12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, SwitchPreference switchPreference, SwitchPreference switchPreference2, cc.c cVar) {
            super(2, cVar);
            this.Y = retroAchievementsPreferencesFragment;
            this.Z = switchPreference;
            this.f9600b0 = switchPreference2;
        }

        @Override // mc.p
        public final Object j(Object obj, Object obj2) {
            return ((AnonymousClass1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }

        @Override // ec.a
        public final cc.c t(cc.c cVar, Object obj) {
            return new AnonymousClass1(this.Y, this.Z, this.f9600b0, cVar);
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [ec.j, mc.q] */
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
            final o1 o1Var = (o1) this.Y.i().f5675d.getValue();
            cd.h hVar = new cd.h() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
                /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes.dex */
                public final class AnonymousClass2<T> implements cd.i {
                    public final /* synthetic */ cd.i A;

                    @ec.e(c = "me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1$2", f = "RetroAchievementsPreferencesFragment.kt", l = {50}, m = "emit", v = 2)
                    /* renamed from: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public final class AnonymousClass1 extends ec.c {
                        public /* synthetic */ Object R;
                        public int X;

                        public AnonymousClass1(cc.c cVar) {
                            super(cVar);
                        }

                        @Override // ec.a
                        public final Object v(Object obj) {
                            this.R = obj;
                            this.X |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.a(null, this);
                        }
                    }

                    public AnonymousClass2(cd.i iVar) {
                        this.A = iVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
                    @Override // cd.i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r5, cc.c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1$2$1 r0 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.X
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.X = r1
                            goto L18
                        L13:
                            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1$2$1 r0 = new me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.R
                            dc.a r1 = dc.a.COROUTINE_SUSPENDED
                            int r2 = r0.X
                            r3 = 1
                            if (r2 == 0) goto L2e
                            if (r2 != r3) goto L27
                            p7.j.I(r6)
                            goto L44
                        L27:
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            a0.j.p(r5)
                            r5 = 0
                            return r5
                        L2e:
                            p7.j.I(r6)
                            ei.c r5 = (ei.c) r5
                            boolean r5 = r5 instanceof ei.a
                            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                            r0.X = r3
                            cd.i r6 = r4.A
                            java.lang.Object r5 = r6.a(r5, r0)
                            if (r5 != r1) goto L44
                            return r1
                        L44:
                            yb.y r5 = yb.y.f14813a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment$onCreatePreferences$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.a(java.lang.Object, cc.c):java.lang.Object");
                    }
                }

                @Override // cd.h
                public final Object c(cd.i iVar, cc.c cVar) {
                    Object c4 = o1Var.c(new AnonymousClass2(iVar), cVar);
                    if (c4 == dc.a.COROUTINE_SUSPENDED) {
                        return c4;
                    }
                    return y.f14813a;
                }
            };
            cd.c h2 = cd.q.h(new di.b(0, (cc.c) null, this.Z));
            ?? jVar = new ec.j(3, null);
            final SwitchPreference switchPreference = this.f9600b0;
            cd.i iVar = new cd.i() { // from class: me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment.onCreatePreferences.4.1.2
                @Override // cd.i
                public final Object a(Object obj2, cc.c cVar) {
                    SwitchPreference.this.setEnabled(((Boolean) obj2).booleanValue());
                    return y.f14813a;
                }
            };
            this.X = 1;
            Object a10 = dd.c.a(this, iVar, v0.A, new t0((q) jVar, (cc.c) null), new cd.h[]{hVar, h2});
            if (a10 != aVar) {
                a10 = yVar;
            }
            if (a10 == aVar) {
                return aVar;
            }
            return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsPreferencesFragment$onCreatePreferences$4(RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment, SwitchPreference switchPreference, SwitchPreference switchPreference2, cc.c cVar) {
        super(2, cVar);
        this.Y = retroAchievementsPreferencesFragment;
        this.Z = switchPreference;
        this.f9599b0 = switchPreference2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((RetroAchievementsPreferencesFragment$onCreatePreferences$4) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new RetroAchievementsPreferencesFragment$onCreatePreferences$4(this.Y, this.Z, this.f9599b0, cVar);
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
            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = this.Y;
            r lifecycle = retroAchievementsPreferencesFragment.getLifecycle();
            lifecycle.getClass();
            androidx.lifecycle.q qVar = androidx.lifecycle.q.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(retroAchievementsPreferencesFragment, this.Z, this.f9599b0, null);
            this.X = 1;
            if (s0.i(lifecycle, qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return y.f14813a;
    }
}
