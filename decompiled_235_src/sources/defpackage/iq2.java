package defpackage;

import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iq2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iq2 implements TextToSpeech.OnInitListener {
    public final /* synthetic */ qq2 a;

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        Locale locale;
        List list;
        Set<Voice> voices;
        if (i == 0) {
            qq2 qq2Var = this.a;
            qq2Var.d = true;
            String string = qq2Var.b.getString("translator_tts_lang", "ru");
            if (string == null) {
                string = "ru";
            }
            int hashCode = string.hashCode();
            if (hashCode != 3201) {
                if (hashCode != 3241) {
                    if (hashCode != 3246) {
                        if (hashCode != 3276) {
                            if (hashCode != 3371) {
                                if (hashCode != 3383) {
                                    if (hashCode != 3428) {
                                        if (hashCode != 3734) {
                                            if (hashCode == 3886 && string.equals("zh")) {
                                                locale = Locale.CHINESE;
                                                locale.getClass();
                                            }
                                            locale = new Locale("ru");
                                        } else {
                                            if (string.equals("uk")) {
                                                locale = new Locale("uk");
                                            }
                                            locale = new Locale("ru");
                                        }
                                    } else {
                                        if (string.equals("ko")) {
                                            locale = Locale.KOREAN;
                                            locale.getClass();
                                        }
                                        locale = new Locale("ru");
                                    }
                                } else {
                                    if (string.equals("ja")) {
                                        locale = Locale.JAPANESE;
                                        locale.getClass();
                                    }
                                    locale = new Locale("ru");
                                }
                            } else {
                                if (string.equals("it")) {
                                    locale = Locale.ITALIAN;
                                    locale.getClass();
                                }
                                locale = new Locale("ru");
                            }
                        } else {
                            if (string.equals("fr")) {
                                locale = Locale.FRENCH;
                                locale.getClass();
                            }
                            locale = new Locale("ru");
                        }
                    } else {
                        if (string.equals("es")) {
                            locale = new Locale("es");
                        }
                        locale = new Locale("ru");
                    }
                } else {
                    if (string.equals("en")) {
                        locale = Locale.ENGLISH;
                        locale.getClass();
                    }
                    locale = new Locale("ru");
                }
            } else {
                if (string.equals("de")) {
                    locale = Locale.GERMAN;
                    locale.getClass();
                }
                locale = new Locale("ru");
            }
            qq2Var.a(locale);
            try {
                TextToSpeech textToSpeech = qq2Var.c;
                if (textToSpeech != null && (voices = textToSpeech.getVoices()) != null) {
                    list = gt0.k1(voices);
                } else {
                    list = yt1.A;
                }
                qq2Var.e = list;
                int size = list.size();
                Log.i("GameTtsManager", "TTS initialized. Available voices: " + size);
                return;
            } catch (Throwable th) {
                String message = th.getMessage();
                Log.w("GameTtsManager", "Cannot query voices: " + message);
                return;
            }
        }
        Log.w("GameTtsManager", "TextToSpeech init failed with code: " + i);
    }
}
