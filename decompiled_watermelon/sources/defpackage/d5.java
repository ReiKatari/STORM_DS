package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import defpackage.b6;
import defpackage.g3;
import defpackage.h03;
import defpackage.ml3;
import defpackage.n11;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.KeyGenerator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements ki2 {
    public final /* synthetic */ int A;

    public /* synthetic */ d5(int i) {
        this.A = i;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return me2.G(k6.All);
            case 1:
                return me2.G(f6.All);
            case 2:
                return me2.G(Boolean.FALSE);
            case 3:
                b6.b bVar = b6.Companion;
                return new zt(g3.a.a, 0);
            case 4:
                b6.b bVar2 = b6.Companion;
                return new zt(ml3.a.a, 0);
            case 5:
                h1 h1Var = c45.A;
                return Integer.valueOf(c45.A.e().nextInt(2147418112) + 65536);
            case ig7.b /* 6 */:
                return UUID.randomUUID().toString();
            case 7:
                KeyGenParameterSpec keyGenParameterSpec = eu3.a;
                if (keyGenParameterSpec.getKeySize() == 256) {
                    if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                        if (keyGenParameterSpec.getPurposes() == 3) {
                            if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                                if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                                    i.i("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                                    return null;
                                }
                                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                if (!keyStore.containsAlias(keystoreAlias)) {
                                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                    keyGenerator.init(keyGenParameterSpec);
                                    keyGenerator.generateKey();
                                }
                                return keyGenParameterSpec.getKeystoreAlias();
                            }
                            f81.i(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
                            return null;
                        }
                        f81.e(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                        return null;
                    }
                    f81.i(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
                    return null;
                }
                i.f(keyGenParameterSpec.getKeySize(), " bits", "invalid key size, want 256 bits got ");
                return null;
            case 8:
                return new mb6(mh7.c(1308617531));
            case 9:
                return new d94("me.magnum.melonds.ui.backgrounds.BackgroundsNavigation.BackgroundList", zz.INSTANCE, new Annotation[0]);
            case 10:
                il6 il6Var = BackportedFixQuirk.a;
                return new h00();
            case 11:
                ye6 ye6Var = y10.a;
                return null;
            case mj2.L /* 12 */:
                return new CameraCaptureSession();
            case 13:
                return me2.G(zk0.b);
            case 14:
                return new d94("me.magnum.melonds.ui.cheats.CheatsNavigation.EnabledCheats", nm0.INSTANCE, new Annotation[0]);
            case ig7.e /* 15 */:
                return new d94("me.magnum.melonds.ui.cheats.CheatsNavigation.GameList", um0.INSTANCE, new Annotation[0]);
            case 16:
                long d = mh7.d(4284612846L);
                long d2 = mh7.d(4281794739L);
                long d3 = mh7.d(4278442694L);
                long d4 = mh7.d(4278290310L);
                long j = xq0.d;
                long d5 = mh7.d(4289724448L);
                long j2 = xq0.b;
                return new hr0(d, d2, d3, d4, j, j, d5, j, j2, j2, j2, j, true);
            case 17:
                return o27Var;
            case 18:
                ye6 ye6Var2 = hv0.a;
                return null;
            case 19:
                xu0.b("Unexpected call to default provider");
                throw new RuntimeException();
            case 20:
                int i2 = px0.b;
                return o27Var;
            case 21:
                int i3 = yx0.b;
                return o27Var;
            case 22:
                int i4 = zx0.b;
                return o27Var;
            case 23:
                tv0 tv0Var = b01.a;
                return Float.valueOf(1.0f);
            case 24:
                n11.b bVar3 = n11.Companion;
                return new zt(h03.a.a, 0);
            case 25:
                return o11.a();
            case 26:
                return me2.G(Boolean.FALSE);
            case 27:
                return UUID.randomUUID();
            case 28:
                float f = mj1.a;
                return Boolean.TRUE;
            default:
                ye6 ye6Var3 = eo1.a;
                return u91.a;
        }
    }
}
