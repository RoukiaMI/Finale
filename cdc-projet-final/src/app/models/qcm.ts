export interface Qcm {
  id: number;
  intitule: string;
  niveau: string;
  nbQuestions: number;
  questions: Question[];
}

export interface Question {
  id: number;
  questions: string;
  reponses: Reponse[];
}

export interface Reponse {
  reponses: string;
}
