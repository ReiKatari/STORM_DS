package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng0  reason: default package */
/* loaded from: classes.dex */
public final class ng0 implements f13 {
    public final Map A;

    public ng0(int i) {
        switch (i) {
            case 2:
                this.A = c14.m0(new vr4("yes", "Да"), new vr4("no", "Нет"), new vr4("ok", "ОК"), new vr4("cancel", "Отмена"), new vr4("back", "Назад"), new vr4("next", "Далее"), new vr4("start", "Старт"), new vr4("press start", "Нажмите START"), new vr4("new game", "Новая игра"), new vr4("continue", "Продолжить"), new vr4("load game", "Загрузить игру"), new vr4("save game", "Сохранить игру"), new vr4("options", "Настройки"), new vr4("settings", "Настройки"), new vr4("inventory", "Инвентарь"), new vr4("equipment", "Снаряжение"), new vr4("items", "Предметы"), new vr4("item", "Предмет"), new vr4("magic", "Магия"), new vr4("skills", "Навыки"), new vr4("skill", "Навык"), new vr4("status", "Статус"), new vr4("quest", "Задание"), new vr4("quests", "Задания"), new vr4("attack", "Атака"), new vr4("defend", "Защита"), new vr4("escape", "Побег"), new vr4("run away", "Сбежать"), new vr4("victory", "Победа!"), new vr4("game over", "Игра окончена"), new vr4("level up", "Новый уровень!"), new vr4("experience", "Опыт"), new vr4("gold", "Золото"), new vr4("money", "Деньги"), new vr4("touch the touch screen", "Коснитесь сенсорного экрана"), new vr4("touch to start", "Коснитесь для начала"), new vr4("tap to begin", "Нажмите для старта"), new vr4("press and hold", "Нажмите и удерживайте"), new vr4("wake up", "Просыпайся!"), new vr4("get up", "Вставай!"), new vr4("come on, sleepyhead!", "Просыпайся, соня!"), new vr4("it's time to get up!", "Пора вставать!"), new vr4("what's going on?", "Что происходит?"), new vr4("what happened?", "Что случилось?"), new vr4("are you ready?", "Ты готов?"), new vr4("let's go!", "Погнали!"), new vr4("wait a minute!", "Минуточку!"), new vr4("hold on!", "Погоди-ка!"), new vr4("good morning!", "Доброе утро!"), new vr4("good night!", "Спокойной ночи!"), new vr4("thank you very much!", "Большое спасибо!"), new vr4("you're welcome!", "Пожалуйста!"), new vr4("see you later!", "Увидимся!"), new vr4("who are you?", "Кто ты?"), new vr4("where are we?", "Где мы?"), new vr4("i don't know", "Я не знаю"), new vr4("be careful", "Будь осторожен"), new vr4("help me", "Помоги мне"), new vr4("let's do this", "Сделаем это"), new vr4("look over there", "Посмотри туда"));
                return;
            default:
                this.A = zt1.A;
                return;
        }
    }

    @Override // defpackage.f13
    public Object j(String str, String str2, String str3, s41 s41Var) {
        return hv.d0(xk1.a, new ag(str, this, str3, null, 10), s41Var);
    }

    public ng0(Map map) {
        this.A = map;
    }
}
